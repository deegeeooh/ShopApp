package duke.choice;

public class ShopApp {
    public static void main(String[] args) {

        double tax = 0.2;
        String[] shoppingBasketCSV;

        // instantiate objects
        Customer customer1  = new Customer("Pinky", "M");
        Clothing item1      = new Clothing("Blue Jacket", 20, 4);
        Clothing item2      = new Clothing("Orange T-Shirt", 10.52, 6);
        Clothing item3      = new Clothing("White Dress Shirt", 25, 5);
        Clothing item4      = new Clothing("Grey Working Trousers", 25, 2);
        
        // add to shoppingbasket (when measure = clients size)
        customer1.Purchase(item1, 2, tax); 
        customer1.Purchase(item2, 1, tax); 
        customer1.Purchase(item3, 1, tax); 
        customer1.Purchase(item4, 1, tax); 

        item1.Setprice(7);
        
        System.out.println("Welcome to the Duke Choice Shop");
        System.out.println("The name of the new customer is: " + customer1.GetName() + " with size: " +
                                                                 customer1.GetSize());
        System.out.println("Shopping basket content:");

        shoppingBasketCSV = customer1.ShoppingBasketCSV();
        if (shoppingBasketCSV.length > 0) {
            for (int i = 0; i < shoppingBasketCSV.length; i++) {
                System.out.println(shoppingBasketCSV[i]);
            }
        }

        System.out.println();
        System.out.println("Total:  " + customer1.GetTotal());     
        System.out.println("Total Iterated (exercise 4-3) :" + (customer1.IterateTotal()));   
    }
}