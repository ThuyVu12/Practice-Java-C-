import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            String itemName = menuItems.get(i);
            System.out.printf("%d %s \n", i, itemName);
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.printf("Hello, %s!", userName);
        System.out.printf("There are %d people ahead of you \n", customers.size() - 1);
        System.out.println(customers);
    }
}
