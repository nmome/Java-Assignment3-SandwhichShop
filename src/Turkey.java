public class Turkey extends SandwichDecorator 
{
    Sandwhich sandwich;

    public Turkey(Sandwhich sandwich) 
    {
        this.sandwich = sandwich;
    }

    public String getDescription() 
    {
        return sandwich.getDescription() + ", Turkey";
    }

    public double getCost() 
    {
        return sandwich.getCost() + 2.00;
    }
}