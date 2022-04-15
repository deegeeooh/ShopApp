package duke.choice;



public class Clothing implements Comparable<Clothing> {  //comparable interface exercise 8-2
    

    // constants (ex 5-1)

    public static final double TaxRate = 0.20; // public seems default
    public static final double minPrice = 10;

    // properties

    private String description;
    private double price; // incl Tax (ex 5-1)
    private String size;

    // constructor
    public Clothing(String _description, double _price, int _measure) {
        description = _description;
        this.Setprice(_price); // ex 5-1
        size = SetSize(_measure); // convert measure to sizes
    }

    // behaviour

    /**
     * Exercise 8-1 override toString method
     * 
     * println uses the ToString method to print an object, 
     * we can override the toString method to print any way we want
     * whenever whenever .toString is used with any of this class object
     */
    
    
    
    @Override           
    public String toString() {      
        return GetDescription() + ", " + GetPrice()+ ", " + GetPrice();
    }

    /**
     * 
     * Exercise 8-2 sorting via comparable interface implementation
     * The comparable interface has one abstract method: compareTo
     * (abstract: has no code body)
     */
     
    @Override
    public int compareTo(Clothing _Clothing) {
        return this.description.compareTo(_Clothing.description);
    }
     
    
    public static String SetSize(int _measurement) { // ex 5-2
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

    public void Setprice(double _aPrice) { // ex 5-1
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
