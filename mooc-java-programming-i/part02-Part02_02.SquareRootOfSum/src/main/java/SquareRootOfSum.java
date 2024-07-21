
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber = Integer.valueOf(scanner.nextLine());
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        int sum = firstNumber + secondNumber;
        
        System.out.println(Math.sqrt(sum));

    }
}
