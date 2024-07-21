
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Container container;
    private int firstValue;
    private int secondValue;

    public UserInterface(Container container, Scanner scanner) {
        this.container = container;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + firstValue + "/100");
            System.out.println("Second: " + secondValue + "/100");

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] words = input.split(" ");
            String command = words[0];
            String valueString = words[1];
            int value = Integer.valueOf(valueString);

            if (command.equals("add")) {
                if (value > 0) {
                    firstValue += value;
                    if (firstValue > 100) {
                        firstValue = 100;
                    }
                }
            } else if (command.equals("move")) {
                if (value > 0) {
                    if (value > firstValue) {
                        value = firstValue;
                    }
                    firstValue -= value;
                    secondValue += value;

                    if (secondValue > 100) {
                        secondValue = 100;
                    }

                }
            } else if (command.equals("remove")) {
                if (value > 0) {
                    secondValue -= value;
                    if (secondValue < 0) {
                        secondValue = 0;
                    }
                }
            }
        }
    }

}
