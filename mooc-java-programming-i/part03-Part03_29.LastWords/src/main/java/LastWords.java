
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            
            String[] parts = input.split(" ");
            String lastPart = parts[parts.length - 1];
            
            System.out.println(lastPart);
        }


    }
}
