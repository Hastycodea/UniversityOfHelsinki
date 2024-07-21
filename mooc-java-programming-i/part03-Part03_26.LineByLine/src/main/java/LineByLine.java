
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();

        String[] pieces = input.split(" ");

        for (String piece : pieces) {
            if (input.isEmpty()) {
                break;
            }
            System.out.println(piece);
        }
        String[] pieces2 = input2.split(" ");

        for (String piece2 : pieces2) {
            if (input2.isEmpty()) {
                break;
            }
            System.out.println(piece2);

        }

    }
}
