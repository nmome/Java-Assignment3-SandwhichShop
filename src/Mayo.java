public class Mayo extends SandwichDecorator 
{
    Sandwhich sandwich;

    public Mayo(Sandwhich sandwich) 
    {
        this.sandwich = sandwich;
    }

    public String getDescription() 
    {
        return sandwich.getDescription() + ", Mayo";
    }

    public double getCost() 
    {
        return sandwich.getCost() + 0.50;
    }
}