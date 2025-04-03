public class Avocado extends SandwichDecorator //Avocado class
{
    Sandwhich sandwich;

    public Avocado(Sandwhich sandwich) 
    {
        this.sandwich = sandwich;
    }

    public String getDescription() 
    {
        return sandwich.getDescription() + ", Avocado";
    }

    public double getCost() 
    {
        return sandwich.getCost() + 4.00;
    }
}