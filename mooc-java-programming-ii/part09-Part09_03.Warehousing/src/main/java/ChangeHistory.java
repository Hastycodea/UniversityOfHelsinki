
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList<>();
    }

    public void add(double status) {
        list.add(status);
    }

    public void clear() {
        list.clear();
    }

    public double maxValue() {
        if (list.isEmpty()) {
            return 0.0;
        }
        double max = list.get(0);
        for (double value : list) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double minValue() {
        if (list.isEmpty()) {
            return 0.0;
        }
        double min = list.get(0);
        for (double value : list) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public double average() {
        if (list.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
