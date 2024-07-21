
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String longestName = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } 
            
            String[] parts = input.split(",");
            int year = Integer.valueOf(parts[1]);
            
            sum = sum + year;
            count = count + 1;
            
            String name = parts[0];
            int length = name.length();
            
            if (length > longestName.length()) {
                longestName = name;                
            }
            
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sum / count);


    }
}
