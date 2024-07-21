
import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> items;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase item : items) {
            totalWeight += item.totalWeight();
        }
        if (totalWeight + suitcase.totalWeight() <= maximumWeight) {
            items.add(suitcase);

        }
    }

    public void printItems() {
        for (Suitcase item : items) {
            item.printItems();
        }
    }

    public String toString() {
        //that returns the string "x suitcases (y kg)"
        int totalWeight = 0;
        for (Suitcase item : items) {
            totalWeight += item.totalWeight();
        }
        int suitQuantity = items.size();
        return suitQuantity + " suitcases (" + totalWeight + " kg)";
    }

}
