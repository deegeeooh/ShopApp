package duke.choice;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer {

    private String name;
    private String size;
    private ArrayList<ShoppingBasketItem> ShoppingBasket = new ArrayList<ShoppingBasketItem>();
    private double Total;

    public Customer(String _name, String _size) { // contructor
        name = _name;
        size = _size;
    }

    public String GetName() {
        return name;
    }

    public void Purchase(Clothing _clothing, int _amount, double _tax) {

        if (_clothing.GetSize() == this.size) { // only add to shopping basket if match customer's size
            ShoppingBasketItem item = new ShoppingBasketItem(_clothing, _amount, _tax, LocalDate.now());
            ShoppingBasket.add(item);
            Total = Total + item.GetTotal();
        }
    }

    public double GetTotal() {
        return Total;
    }

    // or: iterate through array exercise 4-3
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
