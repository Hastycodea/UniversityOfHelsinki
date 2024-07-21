
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            System.out.println("First: " + containerOne.toString());
            System.out.println("Second: " + containerTwo.toString());
            System.out.println("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputParts = input.split(" ");
            input = inputParts[0];
            int value = Integer.valueOf(inputParts[1]);

            if (input.equals("add")) {
                containerOne.add(value);
            }
            if (input.equals("move")) {
                int amount = containerOne.contains();
                containerOne.remove(value);

                if (value >= amount) {
                    containerTwo.add(amount);
                } else {
                    containerTwo.add(value);
                }
            }

            if (input.equals("remove")) {
                containerTwo.remove(value);
            }

        }
    }

}
