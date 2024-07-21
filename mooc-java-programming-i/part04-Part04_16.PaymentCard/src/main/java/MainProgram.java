
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
//        PaymentCard card = new PaymentCard(10);
//        System.out.println("Paul: " + card);
//        card.addMoney(-15);
//        System.out.println("Paul: " + card);
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);
        
        paulCard.eatHeartily();
        mattCard.eatAffordably();
        
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
        
        paulCard.addMoney(20);
        mattCard.eatHeartily();
        
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
        
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        mattCard.addMoney(50);
        
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
        

    }
}
