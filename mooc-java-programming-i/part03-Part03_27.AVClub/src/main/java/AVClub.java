
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        String[] words = input.split(" ");

        for (String word : words) {
            if (word.contains("av")) {

                System.out.print(word);
                System.out.println();

            }

        }
                
        String[] lines = line2.split(" ");
        
        for (String line : lines) {
            if (line.contains("av")) {
                System.out.print(line);
                System.out.println();
            }
        }
        
        String[] strngs = line3.split(" ");
        
        for (String print : strngs) {
            if (print.contains("av")) {
                System.out.print(print);
                System.out.println();                
            }
        }

    }
}
