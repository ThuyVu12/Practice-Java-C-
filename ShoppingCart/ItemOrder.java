public class ItemOrder {
    private Item item;
    private int quantity;
    
    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return item.priceFor(quantity);        
    }
}
