public class Ham extends SandwichDecorator 
{
    Sandwhich sandwich;

    public Ham(Sandwhich sandwich) 
    {
        this.sandwich = sandwich;
    }

    public String getDescription() 
    {
        return sandwich.getDescription() + ", Ham";
    }

    public double getCost() 
    {
        return sandwich.getCost() + 1.50;
    }
}