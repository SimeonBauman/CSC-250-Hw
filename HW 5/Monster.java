
public class Monster extends Inhabitant{

	public Monster(String icon, String name)
    {
        super(icon,name); //creates the instance of the parent class 
        
    }
	
	public void go() {
		Worker w = new Worker(this);
        w.start();
	}
	
}
