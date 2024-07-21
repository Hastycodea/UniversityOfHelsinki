
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item toBeReturned = items.get(0);

        for (Item item : items) {
            if (item.getWeight() > toBeReturned.getWeight()) {
                toBeReturned = item;
            }
        }
        return toBeReturned;
    }

    public String toString() {
        //x items (y kg)
        //return this.items.getName() + " items " + " (" + this.items.getWeight + " kg)";
        int itemCount = this.items.size();

        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        String result = "";

        if (itemCount == 0) {
            result = "no items" + " (" + totalWeight + " kg)";
        }
        if (itemCount == 1) {
            result = "1 item" + " (" + totalWeight + " kg)";
        }
        if (totalWeight < this.maxWeight && (itemCount != 0) && (itemCount != 1)) {
            result = itemCount + " items" + " (" + totalWeight + " kg)";
        }
        return result;

    }

}
