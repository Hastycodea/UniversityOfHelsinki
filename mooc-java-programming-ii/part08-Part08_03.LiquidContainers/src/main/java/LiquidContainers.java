
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String action = parts[0];
            int figure = Integer.valueOf(parts[1]);

            if (figure < 0) {
                continue;
            }

            if (action.equals("add")) {
                int sum = first + figure;
                if (sum <= 100) {
                    first += figure;
                } else if (sum > 100) {
                    first = 100;
                }
            }

            if (action.equals("move")) {
                int sum = second + figure;
                if (figure >= first) {
                    second += first;
                    if (sum > 100) {
                        second = 100;
                    }
                    first = 0;
                } else {
                    first -= figure;
                    if (first > 0) {
                        second += figure;
                        if (sum > 100) {
                            second = 100;
                        }
                    }

                }

            }

            if (action.equals("remove")) {
                if (figure > second) {
                    second = 0;
                } else {
                    second -= figure;
                }
            }

        }
    }

}
