
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secondValue = 0;
        int firstValue = 0;

        while (true) {
            System.out.println("First: " + firstValue + "/100");
            System.out.println("Second: " + secondValue + "/100");

            String input = scan.nextLine();
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

//    public static int addAmount(int input, int first) {
//        int sum;
//        sum = first + input;
//        if (sum > 100) {
//            return 100;
//        } else if (input < 0) {
//            return 0;
//        }
//        return sum;
//    }
}
