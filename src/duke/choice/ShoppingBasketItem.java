package duke.choice;

import java.time.*;

public class ShoppingBasketItem {

    private Clothing Item;
    private int NumberOfItems;
    private LocalDate PurchaseDate;
    private double totalexVAT;

    public ShoppingBasketItem(Clothing _anItem, int _numberOfItemsPurchased, double _tax, LocalDate _purchasedate) {
        
        Item            = _anItem;
        NumberOfItems   = _numberOfItemsPurchased;
        PurchaseDate    = _purchasedate;
        totalexVAT      = NumberOfItems * _anItem.GetPrice();
        totalexVAT      = totalexVAT + totalexVAT * _tax;
    }

    public String GetBasketItemAsCSV(ShoppingBasketItem _basketitem){           //make csv string of basketitem
        
        String basketItemCSV =  _basketitem.Item.GetDescription() + ", " +
                                String.valueOf(_basketitem.Item.GetPrice()) + ", " +
                                _basketitem.Item.GetSize() + ", " +
                                _basketitem.NumberOfItems + ", " +
                                _basketitem.PurchaseDate + ", " +
                                totalexVAT;
        return basketItemCSV;                            
    }
    
    public Clothing GetItem(ShoppingBasketItem _basketitem){
        return _basketitem.Item;
    }
    public int GetNumberOfItems(ShoppingBasketItem _basketitem){
        return _basketitem.NumberOfItems;
    }
    public LocalDate GetDateOfPurchase(ShoppingBasketItem _basketitem){
        return _basketitem.PurchaseDate;
    }
    public double GetTotal(ShoppingBasketItem _basketitem){
        return _basketitem.totalexVAT;
    }
}
