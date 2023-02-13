
public class Room {
	
	Exit[] exits = new Exit[4];
    boolean isActive = false;
    Inhabitant[] inh = new Inhabitant[3];
    
    Room()
    {
        super(); //creates the instance of the parent class 
        
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
}
