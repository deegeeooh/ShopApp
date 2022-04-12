package duke.choice;

import java.time.*;

public class ShoppingBasketItem {

    private Clothing Item;
    private int NumberOfItems;
    private LocalDate PurchaseDate;
    private double totalinclVAT;         

    public ShoppingBasketItem(Clothing _anItem, int _numberOfItemsPurchased, double _tax, LocalDate _purchasedate) {            //constructor
        
        Item            = _anItem;
        NumberOfItems   = _numberOfItemsPurchased;
        PurchaseDate    = _purchasedate;
        totalinclVAT      = NumberOfItems * _anItem.GetPrice() * (1 + _tax);
    }

    public String GetBasketItemAsCSV(ShoppingBasketItem _basketitem){           // make csv string of basketitem
        
        String basketItemCSV =  _basketitem.Item.GetDescription() + ", " +
                                String.valueOf(_basketitem.Item.GetPrice()) + ", " +
                                _basketitem.Item.GetSize() + ", " +
                                _basketitem.NumberOfItems + ", " +
                                _basketitem.PurchaseDate + ", " +
                                totalinclVAT;
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
    public double GetTotal(){
        return totalinclVAT;
    }
    
    
    
    
    
}
