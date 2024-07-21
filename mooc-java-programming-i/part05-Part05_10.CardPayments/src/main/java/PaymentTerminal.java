
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        money = 1000.00;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double priceAffordableMeal = 2.50;

        if (payment >= priceAffordableMeal) {
            money += priceAffordableMeal;
            double change = payment - priceAffordableMeal;
            affordableMeals++;
            return change;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double priceHeartily = 4.30;

        if (payment >= priceHeartily) {
            money += priceHeartily;
            double change = payment - priceHeartily;
            heartyMeals++;
            return change;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double priceAffordableMeal = 2.50;
        if (card.balance() >= priceAffordableMeal) {
            card.takeMoney(2.50);
            affordableMeals++;
            return true;
        } else {
            card.balance();
            return false;
        }

    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        double priceHeartily = 4.30;
        if (card.balance() >= priceHeartily) {
            card.takeMoney(4.30);
            heartyMeals++;
            return true;
        } else {
            card.balance();
            return false;
        }

    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        // ...
        if (sum < 0) {
            return;
        }
        card.addMoney(sum);
        money = money + sum;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
