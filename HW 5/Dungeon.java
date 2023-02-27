import java.util.Random;
public class Dungeon {

	Room[] rooms;
    Room startingRoom;
    int size;
    
    Dungeon(int size)
    {
        super(); //creates the instance of the parent class 
        this.size = size;
        this.rooms = new Room[size*size];
        this.startingRoom = null;
        generateRooms();
        generateMonsters(4);
    }
    
    void generateRooms() {
    	for(int i = 0; i < rooms.length; i++) {
    		rooms[i] = new Room("Room " + (i+1));
    		Random r =  new Random();
    		int x = r.nextInt(100);
    		
    		if(x < 75) {
    			rooms[i].isActive = true;
    		}
    		if(this.startingRoom == null && rooms[i].isActive) {
    			this.startingRoom = rooms[i];
    		}
    	}
    	generateExits();
    }
    
    void showMap() {
    	for(int i = 0; i < size; i++) {
    		for(int j = 0; j < size; j++) {
    			if(rooms[(i * size) +j].isActive && rooms[(i * size) +j].inh[0] == null && rooms[(i * size) +j].isActive) {
    				System.out.print("# ");
    			}
    			else if(rooms[(i * size) +j].inh[0] != null && rooms[(i * size) +j].isActive) {
    				System.out.print(rooms[(i * size) +j].inh[0].icon + ' ');
    			}
    			else {
    				System.out.print("  ");
    			}
    		}
    		System.out.println();
    	}
    }
    void generateExits() {
    	for(int i = 0; i < rooms.length; i++) {
    		
    		if(rooms[i].isActive) {
    			
				if(i < size) {
					rooms[i].exits[0] = null;
				}
				else {
					if(rooms[i - size].isActive) {
						rooms[i].exits[0] = new Exit(rooms[i - size], "north");
					}
				}
				
				if(i % size == 0) {
					rooms[i].exits[3] = null;
				}
				else {
					if(rooms[i - 1].isActive) {
						rooms[i].exits[3] = new Exit(rooms[i - 1], "west");
					}
				}
				
				if(i % size == size - 1) {
					rooms[i].exits[1] = null;
				}
				else {
					if(rooms[i + 1].isActive) {
						rooms[i].exits[1] = new Exit(rooms[i + 1], "east");
					}
				}
				
				
				if(i > (size * size) - size - 1){
					rooms[i].exits[2] = null;
				}
				else {
					if(rooms[i + size].isActive) {
						rooms[i].exits[2] = new Exit(rooms[i + size], "south");
					}
				}
    		}
    		
    		
    	}
    	
    	
    	
    }
    void generateMonsters(int num) {
    	for(int i = 0; i < num; i++) {
    		
    		Monster m = new Monster("M" ,"Big Scary Monster " + i);
    		int pos = (int)(Math.random() * ((size * size) - 1) + 1);
    		if(rooms[pos].isActive) {
	    		rooms[pos].addInhabitant(m);
	    		m.currentRoom = rooms[pos];
	    		m.go();
    		}
    		else {
    			i--;
    		}

    	}
    }
    void showContents() {
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i].inh[0] != null) {
				System.out.print(i + ": ");
				for(int j =0; j < rooms[i].inh.length; j++) {
					if(rooms[i].inh[j] == null) {
						break;
					}
					
					System.out.print(rooms[i].inh[j].name + " ");
					
				}
				System.out.println();
			}
		}
	}
    void getCommands(String command) {
    	if(command.equals("show map")) {
    		this.showMap();
    		return;
    	}
    	
    }
}

	
	