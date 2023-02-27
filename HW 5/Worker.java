import java.util.Random;
public class Worker extends Thread{
	private Monster theMonster;
    
    public Worker(Monster theMonster)
    {
        this.theMonster = theMonster;
    }
    
    //method overloading - we are redefining the run method to do something rather than nothing
    public void run()
    {
        Random r = new Random();
        int num;
        while(true)
        {
            num =  r.nextInt(200) + 30;
            try
            {
                Thread.sleep(num * 100);
                
                //pick a random direction
                
                
                theMonster.changeRoom(r.nextInt(4));
            }
            catch(InterruptedException e)
            {
                System.err.println("Whoops");
            }
        }
        
    }
}
