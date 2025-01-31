import java.util.Scanner;

public class Dungeon
{
    private String name;
    private Player thePlayer;
    
    public Dungeon(String name, Player thePlayer)
    {
        this.name = name;
        this.thePlayer = thePlayer;
        Room r1 = new Room("R1");
	    Room r2 = new Room("R2");
	    Room r3 = new Room("R3");
	    Room r4 = new Room("R4");
	    Room r5 = new Room("R5");
	    Room r6 = new Room("R6");
	    
	    r1.setThePlayer(this.thePlayer);
	    r1.addExit("north", r2);
	    r2.addExit("north", r3);
	    r2.addExit("south", r1);
	    r3.addExit("south", r2);
	    r3.addExit("west", r4);
	    r3.addExit("north", r6);
	    r3.addExit("east", r5);
	    r4.addExit("east", r3);
	    r5.addExit("west", r3);
	    r6.addExit("south", r3);

    }
    
    public void play()
    {
        Scanner input = new Scanner(System.in);
	    String direction = "";
	    do
	    {
	        System.out.print("enter a direction: ");
	        direction = input.nextLine();
	        System.out.println("you entered: " + direction);
	    }
	    while(!direction.equals("exit"));
	    System.out.println("Goodbye");
    }
}