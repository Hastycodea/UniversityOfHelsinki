
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }
        
        int sum = 0;
        
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);           
        }
        double avg;
        avg = sum * 1.0/ numbers.size();
        
        System.out.println("Average: " + avg);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
