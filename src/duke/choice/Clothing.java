package duke.choice;

public class Clothing {
    // properties
    private String description;
    private double price;
    private String size = "M";

    public Clothing(String _description, double _price, String _size) {
        description = _description;
        price = _price;
        size = _size;
    }

    public String GetClothingAttributesCSV() {
        return description + "," + price + "," + size;
    }
    
    public double GetPrice(){
        return price;
    }
    public String GetDescription(){
        return description;
    }
    public String GetSize(){
        return size;
    }

}
