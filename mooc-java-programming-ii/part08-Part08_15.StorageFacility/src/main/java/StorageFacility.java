
import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.facility.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> added = this.facility.get(unit);
        added.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.facility.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> items = this.facility.get(storageUnit);
        items.remove(item);

        if (items.isEmpty()) {
            this.facility.keySet().remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> items = new ArrayList<>();
        for (String item : this.facility.keySet()) {
            if (!items.contains(item)) {
                items.add(item);
            }
        }
        return items;
    }

}
