public class Tuna extends SandwichDecorator 
{
    Sandwhich sandwich;

    public Tuna(Sandwhich sandwich) 
    {
        this.sandwich = sandwich;
    }

    public String getDescription() 
    {
        return sandwich.getDescription() + ", Tuna";
    }

    public double getCost() 
    {
        return sandwich.getCost() + 5.00;
    }
}