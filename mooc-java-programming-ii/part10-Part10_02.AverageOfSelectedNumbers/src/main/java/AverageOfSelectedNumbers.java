
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<Integer> listPositive = new ArrayList<>();
        ArrayList<Integer> listNegative = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            int number = Integer.valueOf(input);
            
            if (number < 0) {
                listNegative.add(number);
            } else {
                listPositive.add(number);
            }
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String answer = scanner.nextLine();
        
        if (answer.equals("p")) {
            double averagePositive = listPositive.stream()
                    .mapToInt(s -> s)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + averagePositive);
        }
        
        if (answer.equals("n")) {
            double averageNegative = listNegative.stream()
                    .mapToInt(s -> s)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + averageNegative);
        }
        

    }
}
