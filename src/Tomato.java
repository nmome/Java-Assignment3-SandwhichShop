public class Tomato extends SandwichDecorator //Tomato Class
{
    Sandwhich sandwich;

    public Tomato(Sandwhich sandwich) 
    {
        this.sandwich = sandwich;
    }

    public String getDescription() 
    {
        return sandwich.getDescription() + ", Tomato";
    }

    public double getCost() 
    {
        return sandwich.getCost() + 3.00;
    }
}