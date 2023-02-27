public class Player extends Inhabitant {
	
	public Player(String icon, String name)
    {
        super(icon, name); //creates the instance of the parent class 
        
    }
	
	void move(String d) {
		if(d.equals("north")) {
			
			if(currentRoom.exits[0] != null) {
				changeRoom(0);
				return;
			}
		}
		if(d.equals("east")) {
			
			if(currentRoom.exits[1] != null) {
				changeRoom(1);
				return;
			}
		}
		if(d.equals("south")) {
			
			if(currentRoom.exits[2] != null) {
				changeRoom(2);
				return;
			}
		}
		if(d.equals("west")) {
			
			if(currentRoom.exits[3] != null) {
				changeRoom(3);
				return;
			}
		}
		
		System.out.println("no exit available");
	}
	

	
}
