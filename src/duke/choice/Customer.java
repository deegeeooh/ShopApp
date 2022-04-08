package duke.choice;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer {

    private String Name;
    private ArrayList<ShoppingBasketItem> ShoppingBasket = new ArrayList<ShoppingBasketItem>();
    private double Total;

    public Customer(String _name) {
        Name = _name;
    }

    public String GetName() {
        return Name;
    }

    public void Purchase(Clothing _clothing, int _amount, double _tax) {
        ShoppingBasket.add(new ShoppingBasketItem(_clothing, _amount, _tax, LocalDate.now()));
    }

    public double CalculateTotalexVAT() {
        for (ShoppingBasketItem item : ShoppingBasket) {
            Total = Total + item.GetTotal(item);                    //?? interesting Total =+ item.GetTotal(item); gives wrong result
        }
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
