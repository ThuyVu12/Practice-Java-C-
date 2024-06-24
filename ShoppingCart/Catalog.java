import java.util.ArrayList;

public class Catalog {
    private String name;
    private int size;
    private ArrayList<Item> items;
    
    public Catalog(String name, int size) {
        this.size = size;
        this.name = name;
        this.items = new ArrayList<>(size);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Item> getList() {
        return items;
    }

    public int size() {
        return items.size();
    }

    public boolean add(Item item) {
        if (items.size() < this.getSize()) {
            items.add(item);
            return true;
        } else {
            return false;
        }
    }

    public Item get(int index) {
        return items.get(index);
    }
}