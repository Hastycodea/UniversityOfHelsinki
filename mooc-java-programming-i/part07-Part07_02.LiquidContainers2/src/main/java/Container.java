import java.util.ArrayList;

public class Container {
    private int total;
    
    public Container() {
    }

    public int contains() {
        return this.total;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.total += amount;
            if (this.total > 100) {
                this.total = 100;
            }
        }
    }
    
    public void remove(int amount) {
        this.total = 0;
        if (amount > 0) {
            this.total -= amount;
            if (this.total < 0) {
                this.total = 0;                
            }
        }
    }
    
    public String toString() {
        return this.total + "/100";
    }
    
}
