
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hands;

    public Hand() {
        this.hands = new ArrayList<>();
    }

    public void add(Card card) {
        hands.add(card);
    }

    public void print() {
        hands.stream().forEach(h -> System.out.println(h.toString()));
    }

    public void sort() {
        Collections.sort(hands);
    }
    
    @Override
    public int compareTo(Hand hand) {
        int sum = 0;
        int total = 0;
        for(Card values : this.hands) {
            sum += values.getValue();
        }
        for(Card value : hand.getHands()) {
            total += value.getValue();
        }
        return sum - total;
    }

    public ArrayList<Card> getHands() {
        return hands;
    }
    
    public void sortBySuit() {
        Collections.sort(hands, (Card c1, Card c2) -> {
            if (c1.getSuit().ordinal() == c2.getSuit().ordinal()) {
                return c1.getValue() - c2.getValue();
            } else {
                return c1.getSuit().ordinal() - c2.getSuit().ordinal();
            }
        });
       
    }
    
}
