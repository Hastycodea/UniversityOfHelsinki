
public class Container {
    private int amount;
    
    public Container() {
        
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.amount += amount;
        
        if (this.amount > 100) {
            this.amount = 100;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.amount -= amount;
        
        if (this.amount < 0) {
            this.amount = 0;
        }
        
    }
    
    @Override    
    public String toString() {
        return this.amount + "/100";
    }
}
