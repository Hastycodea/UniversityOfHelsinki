
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalNumbers = 0;
        int totalSum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            totalNumbers = totalNumbers + 1;
            totalSum = totalSum + number;
        }
        System.out.println("Number of numbers: " + totalNumbers);
        System.out.println("Sum of the numbers: " + totalSum);
    }
}
