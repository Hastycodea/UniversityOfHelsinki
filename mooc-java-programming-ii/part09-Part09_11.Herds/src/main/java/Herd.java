
import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {

    private List<Movable> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    @Override
    public String toString() {
        String result = "";
        for (Movable organism : organisms) {
            result += organism.toString() + "\n";
        }
        return result;
    }

    public void addToHerd(Movable movable) {
        organisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable organism : organisms) {
            organism.move(dx, dy);
        }
    }
}
