package duke.choice;

import java.time.*;

public class ShoppingBasketItem {

    private Clothing Item;
    private int NumberOfItems;
    private LocalDate PurchaseDate;
    private double totalinclVAT;

    public ShoppingBasketItem(Clothing _anItem, int _numberOfItemsPurchased, LocalDate _purchasedate) { // constructor

        Item = _anItem;
        NumberOfItems = _numberOfItemsPurchased;
        PurchaseDate = _purchasedate;
        totalinclVAT = NumberOfItems * _anItem.GetPrice(); // price is calculated at time of purchase
    }

    public String GetBasketItemAsCSV(ShoppingBasketItem _basketitem) { // make csv string of basketitem

        // String basketItemCSV = _basketitem.Item.GetDescription() + ",\t" +
        // String.valueOf(_basketitem.Item.GetPrice()) + ",\t" +
        // _basketitem.Item.GetSize() + ",\t" +
        // _basketitem.NumberOfItems + ",\t" +
        // _basketitem.PurchaseDate + ",\t " +
        // totalinclVAT;
        // return basketItemCSV;

        // testing some format options I miss C# with this

        String basketItemCSV = String.format("|%-20s|", Item.GetDescription()) 
                + String.format("%5.2f", (_basketitem.Item.GetPrice())) 
                + String.format("|%5s|", _basketitem.Item.GetSize()) 
                + String.format("%5s", _basketitem.NumberOfItems) 
                + String.format("|%5s|", _basketitem.PurchaseDate) 
                + String.format("%5.2f|", totalinclVAT);
        return basketItemCSV;

    }

    public Clothing GetItem() {
        return Item;
    }

    public int GetNumberOfItems(ShoppingBasketItem _basketitem) {
        return _basketitem.NumberOfItems;
    }

    public LocalDate GetDateOfPurchase(ShoppingBasketItem _basketitem) {
        return _basketitem.PurchaseDate;
    }

    public double GetTotal() {
        return totalinclVAT;
    }

}
