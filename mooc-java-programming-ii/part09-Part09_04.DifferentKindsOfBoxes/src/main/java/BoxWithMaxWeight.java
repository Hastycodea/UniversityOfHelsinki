
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int totalWeight = this.items.stream().mapToInt(Item::getWeight).sum();
        if (totalWeight + item.getWeight() <= this.capacity) {
            items.add(item);
        }

    }

    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
