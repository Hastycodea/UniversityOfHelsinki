
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double giftValue = Integer.valueOf(scan.nextLine());
        
        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue == 5000) {
            double taxAmount = 100.0;
            System.out.println("Tax: " + taxAmount);
        } else if (giftValue <= 25000) {
            double totalTax = 100.0 + (giftValue - 5000)*0.08;
            System.out.println("Tax: " + totalTax);           
        } else if (giftValue <= 55000) {
            double totalTax = 1700.0 + (giftValue - 25000) * 0.10;
            System.out.println("Tax: " + totalTax);
        } else if (giftValue <= 200000) {
            double totalTax = 4700 + (giftValue - 55000) * 0.12;
            System.out.println("Tax: " + totalTax);
        } else if (giftValue <= 1000000) {
            double totalTax = 22100 + (giftValue - 200000) * 0.15;
            System.out.println("Tax: " + totalTax);
        } else {
            double totalTax = 142100.0 + (giftValue - 1000000) * 0.17;
            System.out.println("Tax: " + totalTax);
        }

    }
}
