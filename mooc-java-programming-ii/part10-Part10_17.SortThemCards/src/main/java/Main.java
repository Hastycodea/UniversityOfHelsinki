
public class Main {

    public static void main(String[] args) {
        // test your code here
        Suit HEART = Suit.HEART;
        Suit SPADE = Suit.SPADE;
        BySuitInValueOrder comparator = new BySuitInValueOrder();
        Card first = new Card(2, HEART);
        Card second = new Card(4, SPADE);
        System.out.println(comparator.compare(first, second));
    }
}
