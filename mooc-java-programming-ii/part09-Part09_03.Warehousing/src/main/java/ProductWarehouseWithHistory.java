/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        addToWarehouse(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double takenAmount = super.takeFromWarehouse(amount);
        changeHistory.add(getBalance());
        return takenAmount;
    }

    public String history() {
        return changeHistory.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName()+ "\nHistory: " + history() + "\nLargest amount of product: " + changeHistory.maxValue() + "\nSmallest amount of product: " + changeHistory.minValue() + "\nAverage: " + changeHistory.average());
    }
    
}
