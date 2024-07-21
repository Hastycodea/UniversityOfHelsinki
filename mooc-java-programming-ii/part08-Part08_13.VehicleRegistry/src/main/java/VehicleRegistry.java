
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!owners.containsKey(licensePlate)) {
            owners.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.owners.containsKey(licensePlate)) {
            this.owners.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public String get(LicensePlate licensePlate) {
        if (this.owners.containsKey(licensePlate)) {
            return this.owners.get(licensePlate);
        }
        return null;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> printedOwners = new ArrayList<>();
        for (String ownerss : owners.values()) {
            if (!printedOwners.contains(ownerss)) {
                System.out.println(ownerss);
                printedOwners.add(ownerss);
            }
        }
    }

}
