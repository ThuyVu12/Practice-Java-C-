import java.text.*;

public class Item {
    private String name;
    private double price;
    private int bulkQuantity;
    private double bulkPrice;

    public Item(String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Invalid Price.");
        }
        this.name = name;
        this.price = price;
        this.bulkQuantity = 0;
        this.bulkPrice = 0;
    }

    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        if (price < 0 || bulkPrice < 0 || bulkQuantity < 0) {
            throw new IllegalArgumentException("Invalid Price, Invalid Bulk Price, Or Invalid Bulk Quantity.");
        }
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getBulkQuantity() {
        return bulkQuantity;
    }

    public double bulkPrice() {
        return bulkPrice;
    }

    public double priceFor(int quantity) {
        if(quantity < 0) {
            throw new IllegalArgumentException("Invalid Quantity");
        }
        
        if(quantity < bulkQuantity || bulkQuantity == 0) {
            return price * quantity;
        } else {
            return ((quantity / bulkQuantity) * bulkPrice) + ((quantity % bulkQuantity) * price); 
        }
    }

    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        if(bulkQuantity == 0) {
            return name + ", " + nf.format(price);
        } else {
            return name + ", " + nf.format(price) + " (" + bulkQuantity + " for " + nf.format(bulkPrice) + ")";
        }       
    }
}
