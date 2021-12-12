package abstractClassSuper;

public class ShopProduct {
    double itemPrice;
    double taxOfItemPrice = 0.23;

    public ShopProduct(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double addTax(double itemPrice) {
       return itemPrice * taxOfItemPrice;


    }

}
