
public class Exit {

	private String direction;
    private Room destinationRoom;
    
    public Exit(Room destinationRoom, String direction)
    {
        super(); //creates the instance of the parent class 
        this.destinationRoom = destinationRoom;
        this.direction = direction;
    }
}
