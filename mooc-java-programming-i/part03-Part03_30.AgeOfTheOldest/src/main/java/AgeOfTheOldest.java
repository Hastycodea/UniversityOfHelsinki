
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;
        String currentLine;
        
        while(!(currentLine = scanner.nextLine()).isEmpty()) { //loop over each non-empty line of input
            String[] parts = currentLine.split(",");
            
            if (parts.length == 2) {
                int age = Integer.valueOf(parts[1]);
                if (age > maxAge) {
                    maxAge = age;
                }
            }
        }
        System.out.println("Age of the oldest: " + maxAge);
        
    }
}
