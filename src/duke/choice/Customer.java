package duke.choice;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer {

    private String Name;
    private ArrayList<ShoppingBasketItem> ShoppingBasket = new ArrayList<ShoppingBasketItem>();
    private double Total;
    
    public Customer(String _name) {     //contructor
        Name = _name;
    }

    public String GetName() {
        return Name;
    }

    public void Purchase(Clothing _clothing, int _amount, double _tax) {                
    
        ShoppingBasketItem item = new ShoppingBasketItem(_clothing, _amount, _tax, LocalDate.now());
        ShoppingBasket.add (item);
        Total = Total + item.GetTotal();
    }

    public double GetTotal(){
        return Total;
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
