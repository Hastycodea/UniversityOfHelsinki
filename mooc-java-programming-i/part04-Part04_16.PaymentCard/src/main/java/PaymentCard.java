/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        // write code here
        while (true) {
            if (this.balance < 2.6) {
                break;
            }
            this.balance = this.balance - 2.60;
            break;
        }

    }

    public void eatHeartily() {
        // write code here
        while (true) {
            if (this.balance < 4.60) {
                break;
            }
            this.balance = this.balance - 4.60;
            break;
        }
    }

    public void addMoney(double amount) {
        // write code here
        if (amount > 0) {
            if (this.balance < 150 && this.balance + amount <= 150) {
                this.balance += amount;
            } else {
                this.balance = 150;
            }
        } else {
            this.balance = 0 + this.balance;
        }

    }

}
