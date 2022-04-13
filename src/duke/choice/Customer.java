package duke.choice;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer {

    private String name;
    private String size;
    private ArrayList<ShoppingBasketItem> ShoppingBasket = new ArrayList<ShoppingBasketItem>();
    private double Total;       // total of all shoppingbasket items incl tax

    public Customer(String _name, String _size) { // contructor
        name = _name;
        size = _size;
    }

    public String GetName() {
        return name;
    }
    public String GetSize() {
        return size;
    }

    
    public void Purchase(Clothing _clothing, int _amount) {

        if (_clothing.GetSize() == this.size) { // only add to shopping basket if match customer's size
            ShoppingBasketItem item = new ShoppingBasketItem(_clothing, _amount, LocalDate.now());
            ShoppingBasket.add(item);
            Total += item.GetTotal();      
        }
    }

    public double GetTotal() { 
        return Total;
    }

    // or: iterate through array exercise 4-3       this calculates total based on current item's prices
    public double IterateTotal() {
        double iteratedTotal = 0;
        for (ShoppingBasketItem item : ShoppingBasket) {
            iteratedTotal = iteratedTotal + item.GetItem().GetPrice() * item.GetNumberOfItems(item);
        }
        return iteratedTotal;
    }

    public String[] ShoppingBasketCSV() {

        String[] basketCSV = new String[ShoppingBasket.size()];
        int i = 0;
        for (ShoppingBasketItem item : ShoppingBasket) {
            basketCSV[i] = item.GetBasketItemAsCSV(item);
            i++;
        }
        return basketCSV;
    }

}
