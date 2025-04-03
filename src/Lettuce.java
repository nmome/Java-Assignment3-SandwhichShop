public class Lettuce extends SandwichDecorator //Lettuce Class
{
    Sandwhich sandwich;

    public Lettuce(Sandwhich sandwich) 
    {
        this.sandwich = sandwich;
    }

    public String getDescription() 
    {
        return sandwich.getDescription() + ", Lettuce";
    }

    public double getCost() 
    {
        return sandwich.getCost() + 1.00;
    }
}