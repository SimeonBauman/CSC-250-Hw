
public class commander {

	String[] playerCommands = {"north", "east", "south", "west"};
	
	String[] dungeonCommands = {"show map"};

	Player currentPlayer;
	Dungeon currentDungeon;
	
	String blueCode = "\u001B[36m";
	String greenCode = "\u001B[32m";
	
	commander(Player p, Dungeon d){
		currentPlayer = p;
		currentDungeon = d;
	}
	
	void Contains(String com) {
		
		if(com.equals("show commands")) {
			showCommands();
			return;
		}
		for(int i = 0; i < playerCommands.length; i++) {
			if(com.equals(playerCommands[i])) {
				currentPlayer.move(playerCommands[i]);
				return;
			}
		}
		for(int i = 0; i < dungeonCommands.length; i++) {
			if(com.equals(dungeonCommands[i])) {
				currentDungeon.getCommands(com);
				return;
			}
		}
		
	}
	
	void showCommands() {
		for(int i = 0; i < playerCommands.length; i++) {
			System.out.println(greenCode + playerCommands[i]);
		}
		for(int i = 0; i < dungeonCommands.length; i++) {
			System.out.println(blueCode + dungeonCommands[i]);
		}
		System.out.print("\u001B[0m");
	}
}
