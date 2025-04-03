import java.util.List;

public class SandwichFactory 
{
    public static Sandwhich createSandwich(String size, List<String> customizations) //creates sandwich with size and customization of toppings
    {
        Sandwhich sandwich = null;

        switch (size.toLowerCase()) 
        {
            case "small":
                sandwich = new SmallSandwich();
                break;
            case "medium":
                sandwich = new MediumSandwich();
                break;
            case "large":
                sandwich = new LargeSandwich();
                break;
        }

        for (String customization : customizations) //for all of the strings in customizations look for condiments to add
        {
            switch (customization.toLowerCase()) 
            {
                case "turkey":
                    sandwich = new Turkey(sandwich);
                    break;
                case "cheese":
                    sandwich = new Cheese(sandwich);
                    break;
                case "bacon":
                    sandwich = new Bacon(sandwich);
                    break;
                case "avocado":
                    sandwich = new Avocado(sandwich);
                    break;
                case "Ham":
                    sandwich = new Ham(sandwich);
                    break;
                case "Lettuce":
                    sandwich = new Lettuce(sandwich);
                    break;
                case "mayo":
                    sandwich = new Mayo(sandwich);
                    break;
                case "onion":
                    sandwich = new Onion(sandwich);
                    break;
                case "tomato":
                    sandwich = new Tomato(sandwich);
                    break;
                case "tuna":
                    sandwich = new Tuna(sandwich);
                    break;
            }
        }
        return sandwich;
    }
}
