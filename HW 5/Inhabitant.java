
public class Inhabitant{

	String name;
    String icon;
    Room currentRoom;
    
    public Inhabitant(String icon , String name)
    {
    	this.icon = icon;
    	this.name = name;
    }

    void changeRoom(int index) {
    	Room r = this.currentRoom;
    	if(currentRoom.exits[index] != null) {
			this.currentRoom.removeInhabitant(this);
			this.currentRoom = currentRoom.exits[index].destinationRoom;
			this.currentRoom.addInhabitant(this);
			
		}
    	if(this.icon.equals("p")) {
    		this.currentRoom.displayInfo();
    	}
    	else {
    		if(currentRoom.inh[0].icon.equals("p")) {
    			System.out.println(this.name + " has entered the room");
    		}
    		else {
    			System.out.println(this.name + " has left " + r.name);
    		}
    	}
	}
}
