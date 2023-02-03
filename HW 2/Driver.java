
public class Driver {
	
	public static void main(String[] args) {
		
		Dungeon d = new Dungeon(100);
		Inhabitant jeff = new Inhabitant(d.startRoom, "Monster");
		Exit E1 =  new Exit(2);
		Player Dave =  new Player("Dave");
		Monster Jimothy =  new Monster("Jimothy");
		System.out.println("Created all objects");
		
	}
}
