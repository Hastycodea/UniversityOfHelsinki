
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        double count = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sum = sum + number;
                count = count + 1;
            }
         
           
        }
        
              
        if (sum > 0) {
            //double average = sum / count;
            System.out.println(sum / count);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
