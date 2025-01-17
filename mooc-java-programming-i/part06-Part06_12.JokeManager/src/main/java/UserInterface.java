
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("What a joke!");
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            System.out.println("");
            String command = scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String theJoke = scanner.nextLine();
                jokeManager.addJoke(theJoke);
            } 
            if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(jokeManager.drawJoke());
            }
            if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();
            }
        }
    }

}

