import java.util.ArrayList;

public class Driver
{
	public static void main(String[] args) 
	{
	    Player p1 = new Player("Mike");
	    Dungeon theDungeon = new Dungeon("Death's Cross", p1);
	    theDungeon.play();
	    /*
	    ArrayList<Player> ar = new ArrayList<Player>();
	    ar.add(p1);
	    //ar.add(theDungeon);
	    
	    for(int i = 0; i < ar.size(); i++)
	    {
	        System.out.println(ar.get(i).isDead());
	    }
	    */
	    
	     
	}
}
