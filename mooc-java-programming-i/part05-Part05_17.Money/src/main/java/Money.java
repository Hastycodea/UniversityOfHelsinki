
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        // create a new Money object that has the correct worth
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();

        if (newCents > 99) {
            newEuros += newCents / 100;
            newCents = newCents % 100;
        }

        Money newMoney = new Money(newEuros, newCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (compared.euros() > this.euros) {
            return true;
        }

        if (compared.euros() == this.euros && compared.cents() > this.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int totalCents = this.euros * 100 + this.cents;
        int decreaserCents = decreaser.euros()*100 + decreaser.cents();

        int totalNewCents = totalCents - decreaserCents;

        if (totalNewCents < 0) {
            return new Money (0, 0);
        }
        
        int newEuros = totalNewCents / 100;
        int newCents = totalNewCents % 100;
        
        return new Money(newEuros, newCents);
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
