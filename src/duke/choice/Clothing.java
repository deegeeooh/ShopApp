package duke.choice;

public class Clothing {

    // constants (ex 5-1)

    public static final double TaxRate  = 0.20;        // public seems default 
    public static final double minPrice = 10;   

    // properties

    private String description;
    private double price;       // incl Tax (ex 5-1)
    private String size;

    // constructor
    public Clothing(String _description, double _price, int _measure) {
        description = _description;
        this.Setprice(_price);          // ex 5-1
        size = SetSize(_measure);       // convert measure to sizes
    }
    
    
    // behaviour
    
    public static String SetSize(int _measurement) {          // ex 5-2
        switch (_measurement) {
        case 1, 2, 3:
            return "S";

        case 4, 5, 6:
            return "M";
            
        case 7, 8, 9:
            return "L";

        case 10, 11, 12:
            return "XL";

        default:
            return "M";
        }
    }

    public void Setprice (double _aPrice){                  //ex 5-1
        price = (_aPrice >= minPrice) ? _aPrice * (1 + TaxRate) : minPrice * (1 + TaxRate);
    }
    
    public double GetPrice() {
        return price;
    }

    public String GetDescription() {
        return description;
    }

    public String GetSize() {
        return size;
    }

}
