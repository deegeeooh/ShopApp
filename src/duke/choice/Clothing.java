package duke.choice;

public class Clothing {

    private String description;
    private double price;
    private String size = "M";

    // constructor
    public Clothing(String _description, double _price, int _size) {
        description = _description;
        price       = _price;
        size        = SetSize(_size);
    }
    
    public String SetSize(int _size){
        switch (_size) {
            case 1,2,3:
                return "S";

            case 4,5,6:
                return "M";

            case 7, 8, 9:
                return "L";
                
            case 10, 11, 12:
                return "XL";
           
            default:
                return "M";
        }
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
