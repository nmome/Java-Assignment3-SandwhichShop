public class Bacon extends SandwichDecorator 
{
    Sandwhich sandwich;

    public Bacon(Sandwhich sandwich) 
    {
        this.sandwich = sandwich;
    }

    public String getDescription() 
    {
        return sandwich.getDescription() + ", Bacon";
    }

    public double getCost() 
    {
        return sandwich.getCost() + 2.50;
    }
}