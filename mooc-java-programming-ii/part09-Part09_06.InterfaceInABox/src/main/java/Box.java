
import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> packables;
    private double weight;

    public Box(double weight) {
        this.packables = new ArrayList<>();
        this.weight = weight;
    }

    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        for (Packable packable : packables) {
            weight += packable.weight();
        }
        return weight;
    }

    public double totalWeight() {
        double totalWeight = 0;
        for (Packable packable : packables) {
            totalWeight += packable.weight();
        }
        return totalWeight;
    }

    public void add(Packable packable) {
        if (totalWeight() + packable.weight() <= this.weight) {
            this.packables.add(packable);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.packables.size() + " items, total weight " + this.totalWeight() + " kg";
    }

}
