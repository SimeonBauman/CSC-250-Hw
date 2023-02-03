
public class Dungeon {

	public Room[] rooms;
	Room startRoom;
	
	Dungeon(int maxRooms){
		this.rooms = new Room[maxRooms];
		this.startRoom = null;
	}
}
