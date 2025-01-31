public class Fighter extends Player
{
    private int rage;
    
    public Fighter(String name)
    {
        //call our parent's constructor so we can build our baseline
        super(name); //the call to parents constructor must be first in java
        //this.display();
        Dice d4 = new Dice(4);
        Dice d100 = new Dice(100);
        this.rage = d100.roll();
        
        this.str = this.str + d4.roll();
        this.ac = this.ac + (2 * d4.roll());
    }
    
    public void display()
    {
        super.display();
        System.out.println("Rage: " + this.rage);
    }
}