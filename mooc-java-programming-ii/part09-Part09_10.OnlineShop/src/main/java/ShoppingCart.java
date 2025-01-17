
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    
    private Map<String, Item> cart;
    
    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
        } else {
            this.cart.put(product, new Item(product, 1, price));
        }
    }
    
    public int price() {
        int sum = 0;
        for(String key : this.cart.keySet()) {
            sum += this.cart.get(key).price();
        }
        return sum;
    }
    
    public void print() {
        for(String key : this.cart.keySet()) {
            System.out.println(this.cart.get(key));
        }
    }
}
