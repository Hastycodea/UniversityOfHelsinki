
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int totalPrice;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
        this.totalPrice = pricePerSquare * squares;

    }

    public boolean largerThan(Apartment compared) {
        if (this.squares < compared.squares) {
            return false;
        }
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int difference;
        if (this.totalPrice > compared.totalPrice) {
            difference = this.totalPrice - compared.totalPrice;
        } else {
            difference = compared.totalPrice - this.totalPrice;
        }
        return difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.totalPrice > compared.totalPrice) {
            return true;
        }
        if (this.totalPrice < compared.totalPrice) {
            return false;
        }
        return false;
    }

}
