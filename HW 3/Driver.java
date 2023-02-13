
public class Driver {
	
	public static void main(String[] args) {
		int size = 5;
		Dungeon d = new Dungeon(size);
		d.startingRoom = d.rooms[0];
		Player p1 = new Player("p", "Little weak Player");
		d.startingRoom.addInhabitant(p1);
		d.showMap();
		d.showContents();
	}
}
