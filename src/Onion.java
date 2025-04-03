public class Onion extends SandwichDecorator 
{
    Sandwhich sandwich;

    public Onion(Sandwhich sandwich) 
    {
        this.sandwich = sandwich;
    }

    public String getDescription() 
    {
        return sandwich.getDescription() + ", Onion";
    }

    public double getCost() 
    {
        return sandwich.getCost() + 2.00;
    }
}