package duke.choice;

import java.util.ArrayList;

public class Customer {

    private static String Name;
    private static ArrayList<Clothing> purchasedClothing = new ArrayList<Clothing>();
    private static double Total;
    
    public Customer(String _name) {
        Name = _name;
    }
    public String GetName(){
        return Name;
    }
    
    public void Purchase(Clothing _clothing) {
        purchasedClothing.add(_clothing); 
    }
    
    public double CalculateTotal(){
        for (Clothing clothing : purchasedClothing) {
            Total += clothing.GetPrice();
        }        
        return Total;
    }
    
    
}   
