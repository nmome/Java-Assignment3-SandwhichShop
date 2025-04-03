
public abstract class Sandwhich //parent class for small, medium, and large sandwiches.
{
	String description = "Unknown Sandwich";

    public String getDescription() 
    {
        return description;
    }

    public abstract double getCost();
}



