package duke.choice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/**
 * 
 * 
 * frequently used keyboard shortcuts:
 * 
 * CTRL-SHIFT-P         command palette
 * SHIFT-ALT-F          format document
 * ALT-UP or DN         move line
 * ALT-UP or DN         move line
 * ALT-UP or DN         move line
 * SHIFT-ALT UP or DN   copy line up or down
 * /**                  start typing commentblock
 * 
 * settings:
 * codelens on references
 * java: Inlay hints> parameter Names: enabled off
 * 
 */



public class ShopApp {
    public static void main(String[] args) {

        
        String[] shoppingBasketCSV;
        Locale currentlocale = Locale.getDefault();
        System.out.println("Current JVM locale: " + currentlocale); // en_US = default ?

        System.out.println("Clothing Taxrate: " + Clothing.TaxRate + "\n" + "Clothing minimum Price: "
                + Clothing.minPrice + "\n\n");

        // instantiate objects
        Customer customer1 = new Customer("Pinky", "M");
        Clothing item1 = new Clothing("Blue Jacket", 20, 4);
        Clothing item2 = new Clothing("Orange T-Shirt", 10.52, 6);
        Clothing item3 = new Clothing("White Dress Shirt", 25, 5);
        Clothing item4 = new Clothing("Grey Working Trousers", 25, 2);
        
        Clothing[] clothingArray = {item1,item2,item3,item4};
        //list<Clothing> o = new ArrayList<>();// why doesnt this work?
        Arrays.sort(clothingArray);
        for (Clothing clothing : clothingArray) {
            System.out.println(clothing);    
        }
        
        /**
         * 
         * exercise 8-1 override toString method of Object class.
         * 
         */

        System.out.println("Item: " + item1.toString()); //

        // add to shoppingbasket (when measure = clients size)
        customer1.Purchase(item1, 2);
        customer1.Purchase(item2, 1);
        customer1.Purchase(item3, 1);
        customer1.Purchase(item4, 1);

        // item1.Setprice(7);

        System.out.println("Welcome to the Duke Choice Shop\n");
        System.out.println("The name of the new customer is: " + customer1.GetName() + " with size: "
                + customer1.GetSize() + "\n");
        System.out.println("Shopping basket content:");

        shoppingBasketCSV = customer1.ShoppingBasketCSV();
        if (shoppingBasketCSV.length > 0) {
            for (int i = 0; i < shoppingBasketCSV.length; i++) {
                System.out.println(shoppingBasketCSV[i]);

            }
        }
        // exersize 7-1
        ArrayList<ShoppingBasketItem> itemsInBasket = customer1.getShoppingBasket();

        if (itemsInBasket.size() > 0) {
            int averagePrice = 0; // using an int here because Java doenst give an exception when this a double
            int numberFound = 0;
            for (ShoppingBasketItem shoppingBasketItem : itemsInBasket) {

                if (shoppingBasketItem.GetItem().GetSize() == "L") {
                    averagePrice += shoppingBasketItem.GetItem().GetPrice();
                    numberFound++;

                }
            }
            try {
                var a = averagePrice / numberFound;
                // averagePrice = averagePrice / numberFound;
                System.out.println("Average price of all items size \"L\" " + averagePrice);
            } catch (ArithmeticException e) {
                System.out.println("Exception: don't devide by zero");
            }
        }

        System.out.println();
        System.out.println("Total:  " + customer1.GetTotal());
        System.out.println("Total Iterated (exercise 4-3) :" + (customer1.IterateTotal()));
    }
}