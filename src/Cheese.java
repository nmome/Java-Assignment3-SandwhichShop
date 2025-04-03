public class Cheese extends SandwichDecorator 
{
    Sandwhich sandwich;

    public Cheese(Sandwhich sandwich) 
    {
        this.sandwich = sandwich;
    }

    public String getDescription() 
    {
        return sandwich.getDescription() + ", Cheese";
    }

    public double getCost() 
    {
        return sandwich.getCost() + 1.00;
    }
}