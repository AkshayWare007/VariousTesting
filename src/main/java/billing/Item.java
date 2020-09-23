package billing;

/**
 * Created by Akshay on 23-09-2020.
 */
public class Item {
    private double price;

    public Item(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
