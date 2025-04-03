/* Nathan Munro
 * CPI 394
 * Professor Selgrad
 * 3/9/25
 * Summary: In this assignemnt I have created a sandwich shop POS. I have made it using a base abstact class of Sandwhich to then go into
 * the child classes of small, medium, and large sandwich. From there users will also be able to add the condiments that they want on the sandwich
 * At the end of creating the sandwich the user will see there total with and without tax. 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainShop 
{
	
    public static void main(String[] args) 
    {
    	
    	
        Scanner scanner = new Scanner(System.in);
        List<Sandwhich> orderList = new ArrayList<>(); //creating a sandwich list for checkout
        //prompt for what size of sandwich or to check out
        while (true) 
        {
            System.out.println("Welcome to the Sandwich Shop!");
            System.out.println("Choose your sandwich size:");
            System.out.println("1. Small Sandwich ($5)");
            System.out.println("2. Medium Sandwich ($7)");
            System.out.println("3. Large Sandwich ($9)");
            System.out.println("0. Finish Order");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 0) break;
            //if choice = 1 then it is small, 2 for medium, anything else for large
            String sandwichSize = choice == 1 ? "small" :
                                  choice == 2 ? "medium" : "large";
            List<String> customizations = new ArrayList<>(); //create a list of condiments

            while (true) 
            {
                System.out.println("Choose your toppings:");
                System.out.println("1.  Turkey ($2)");
                System.out.println("2.  Cheese ($1)");
                System.out.println("3.  Bacon ($2.50)");
                System.out.println("4.  Avocado ($4.00)");
                System.out.println("5.  Ham ($1.50)");
                System.out.println("6.  Lettuce ($1.00)");
                System.out.println("7.  Mayo ($0.50)");
                System.out.println("8.  Onion ($2.00)");
                System.out.println("9.  Tomato ($3.00)");
                System.out.println("10. Tuna ($5.00)");
                System.out.println("0.  Done");

                int addon = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (addon == 0) 
                {
                	Sandwhich sandwich = SandwichFactory.createSandwich(sandwichSize, customizations);
                    orderList.add(sandwich);
                    displayInvoice(orderList);
                    break;
                }

                if (addon == 1) customizations.add("turkey");
                if (addon == 2) customizations.add("cheese");
                if (addon == 3) customizations.add("bacon");
                if (addon == 4) customizations.add("ham");
                if (addon == 5) customizations.add("bacon");
                if (addon == 6) customizations.add("lettuce");
                if (addon == 7) customizations.add("mayo");
                if (addon == 8) customizations.add("onion");
                if (addon == 9) customizations.add("tomato");
                if (addon == 10) customizations.add("tuna");
            }

            
        }

        
    }
    // function that is used to display the final total and tax within the program.
    public static void displayInvoice(List<Sandwhich> orderList) 
    {
        double total = 0;
        System.out.println("\nYour Order Summary:");
        //for each sandwich in orderList get the description and get the cost.
        for (Sandwhich item : orderList) 
        {
            System.out.println(item.getDescription() + " - $" + item.getCost());
            total += item.getCost();
        }

        double tax = total * 0.08;
        double finalTotal = total + tax;
        

        System.out.println("\nSubtotal: $" + total);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + finalTotal +"\n");
    }
}
