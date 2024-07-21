
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> mapPrice;
    private Map<String, Integer> mapStock;

    public Warehouse() {
        this.mapPrice = new HashMap<>();
        this.mapStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.mapPrice.put(product, price);
        this.mapStock.put(product, stock);
    }

    public int price(String product) {
        for (String key : mapPrice.keySet()) {
            if (key.equals(product)) {
                return mapPrice.get(key);
            }
        }
        return -99;
    }

    public int stock(String product) {
        for (String key : mapStock.keySet()) {
            if (key.equals(product)) {
                return mapStock.get(key);
            }
        }
        return 0;
    }

    public boolean take(String product) {
        int newStock = 0;
        for (String key : mapStock.keySet()) {
            if (key.equals(product) && mapStock.get(key) >= 1) {
                    newStock = mapStock.get(key) - 1;
                    mapStock.put(key, newStock);
                    return true;
            }
        }
        return false;
    }
    
    public Set<String> products() {
            return mapStock.keySet();
    }

//    @Override
//    public String toSttring() {
//        
//    }
}
