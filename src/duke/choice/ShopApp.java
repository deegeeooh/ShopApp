package duke.choice;

import java.util.ArrayList;
import java.util.List;

public class ShopApp {
    public static void main(String[] args) {
        
        double tax = 0.2;
        double total;
        
        Customer c1 = new Customer("Pinky");
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
            
        c1.Purchase(item1);
        c1.Purchase(item2);
        total = c1.CalculateTotal();
        
        System.out.println("Welcome to the Duke Choice Shop");
        System.out.println("The name of the new customer is: " + c1.GetName());
        System.out.println("Purchased clothing:");
        System.out.print(item1.GetClothingAttributesCSV() + " " + item2.GetClothingAttributesCSV());
        System.out.println();
        System.out.println("Total costs: "+ (total += total * tax));
    }
}
