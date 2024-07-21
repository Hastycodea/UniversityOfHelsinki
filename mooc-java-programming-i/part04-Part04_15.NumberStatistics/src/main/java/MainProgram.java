
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics total = new Statistics();
        Statistics evenTotal = new Statistics();
        Statistics oddTotal = new Statistics();

        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        System.out.println("Enter numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            total.addNumber(input);

            if (input % 2 == 0) {
                evenTotal.addNumber(input);
            } else {
                oddTotal.addNumber(input);
            }

        }
        System.out.println("Sum: " + total.sum());
        System.out.println("Sum of even numbers: " + evenTotal.sum());
        System.out.println("Sum of odd numbers: " + oddTotal.sum());
    }

}
