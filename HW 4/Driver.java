import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		int size = 5;
		Dungeon d = new Dungeon(size);
		
		Player p1 = new Player("p", "Little weak Player");
		d.startingRoom.addInhabitant(p1);
		p1.currentRoom = d.startingRoom;
		d.startingRoom.displayInfo();
		commander c = new commander(p1,d);
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("enter the command you would like to execute");
			String command = input.nextLine();
			
			c.Contains(command);
			
			
		}
		
		
	}
}
 