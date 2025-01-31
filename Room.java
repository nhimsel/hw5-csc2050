class Room
{
    private String name;
    private Player thePlayer;
    private Exit[] availableExits = new Exit[4];
    private int currNumberOfExits = 0;
    
    public Room(String name)
    {
        this.name = name;
        this.thePlayer = null;
    }
    
    public void addExit(String direction, Room destination)
    {
        if(this.currNumberOfExits <= 3)
        {
            Exit e = new Exit(direction, destination);
            this.availableExits[this.currNumberOfExits] = e;
            this.currNumberOfExits++;
        }
        else
        {
            System.err.println("there are too many exits!!!!");
        }
    }
    
    public void setThePlayer(Player thePlayer)
    {
        this.thePlayer = thePlayer;
    }
    
    public void display()
    {
        System.out.println("Room: " + this.name);
        
        if(this.thePlayer != null)
        {
            System.out.println("Also here: " + this.thePlayer.getName());
        }
        else
        {
            System.out.println("Also here: nobody");

        }
        
        System.out.print("Obvious Exits: ");
        if(this.currNumberOfExits == 0)
        {
            System.out.println("none");
        }
        else
        {
            for(int i = 0; i < this.currNumberOfExits; i++)
            {
                System.out.print(this.availableExits[i].getDirection() + " ");
            }
            System.out.println("");
        }
    }
}