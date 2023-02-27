 import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		int size = 10;
		Dungeon d = new Dungeon(size);
		
		Player p1 = new Player("p", "Little weak Player");
		Player p2 = new Player("p", "Player 2");
		d.startingRoom.addInhabitant(p1);
		//d.startingRoom.addInhabitant(p2);
		p1.currentRoom = d.startingRoom;
		p2.currentRoom = d.startingRoom;
		d.startingRoom.displayInfo();
		commander c = new commander(p1,d);
		Scanner input = new Scanner(System.in);
		String turn = "p1";
		while(true) {
			/*if(turn.equals("p1")) {
				c.currentPlayer = p1;
				turn = "p2";
			}
			else if(turn.equals("p2")) {
				
				c.currentPlayer = p2;
				turn = "p1";
			}*/
			System.out.println("enter the command you would like to execute");
			String command = input.nextLine();
			
			c.Contains(command);
			
		}
		
		
	}
}
 