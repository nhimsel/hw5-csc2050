public class Exit
{
    private String direction;
    private Room destination;
    
    public Exit(String direction, Room destination)
    {
        this.direction = direction;
        this.destination = destination;
    }
    
    public String getDirection()
    {
        return this.direction;
    }

    public Room getDestinataion()
    {
        return this.destination;
    }
}