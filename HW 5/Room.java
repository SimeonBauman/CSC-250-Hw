public class Room {
	
	Exit[] exits = new Exit[4];
    boolean isActive = false;
    Inhabitant[] inh = new Inhabitant[3];
    String name;
    
    String greenCode = "\u001B[32m";
    String redCode = "\u001B[31m";
    String blueCode = "\u001B[36m";
    
    Room(String name)
    {
        this.name = name; //creates the instance of the parent class 
        
    }
	
    void fillInhabitents() {
    	for(int i = 0; i < inh.length; i++) {
    		inh[i] = null;
    	}
    }
    
    void addInhabitant(Inhabitant h) {
    	for(int i = 0; i < inh.length; i++) {
    		if(inh[i] == null) {
    			inh[i] = h;
    			return;
    		}
    	}
    	
    }
    void removeInhabitant(Inhabitant h) {
    	for(int i = 0; i < inh.length; i++) {
    		if(inh[i] == h) {
    			inh[i] = null;
    		}
    	}
    }
    void displayInfo() {
    	System.out.println("Room: " + this.name);
    	System.out.print("current inhabitants: ");
    	for(int i = 0; i < inh.length; i++) {
    		
    		if(inh[i] == null) {
    			break;
    		}
    		if(inh[i].icon.equals("p")) {
    			System.out.print(greenCode + inh[i].name + " ");
    		}
    		else {
    			System.out.print(redCode + inh[i].name + " ");
    		}
    		
    	}
    	
    	System.out.println("\u001B[0m");
    	System.out.print("Exits: ");
    	for(int i = 0; i < exits.length; i++) {
    		if(exits[i] != null) {
    			System.out.print(blueCode + exits[i].direction + ", ");
    		}
    	}
    	System.out.println("\u001B[0m");
    	
    }
}
