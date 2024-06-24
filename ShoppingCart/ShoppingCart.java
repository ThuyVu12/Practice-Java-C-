import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<ItemOrder> orders;
    private double totalPrice;
    private boolean value;
    private double discount;

    public ShoppingCart(int size) {
        this.orders = new ArrayList<>(size);
    }

    public ArrayList<ItemOrder> getOrders() {
        return orders;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean getValue() {
        return value;
    }

    public double discount() {
        return discount;
    }

    public void add(ItemOrder itemOrder) {
        orders.add(itemOrder);
    }

    public double setDiscount(boolean value) {
        this.value = value;
        discount = 0;
        if(value) {
            discount += totalPrice / 100 * 10;
        } else {
            discount = 0;
        }   
        return discount;
    }    

    public double getTotal() {
        totalPrice = 0;
        for (int i = 0; i < orders.size(); i++) {
            totalPrice += orders.get(i).getPrice();
        }
        
        if (value == true) {
            totalPrice = totalPrice - discount;
        }
        return totalPrice;
    }
}



