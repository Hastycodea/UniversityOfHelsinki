
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();

                System.out.println("Translation: ");
                String translation = scanner.nextLine();

                this.simpleDictionary.add(word, translation);

            } else if (input.equals("search")) {
                System.out.println("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                String result = this.simpleDictionary.translate(toBeTranslated);
                if (result == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.println(result);
                }
            } else {
                System.out.println("Unknown command");
            }

        }
    }

}
