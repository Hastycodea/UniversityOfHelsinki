
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        
        UserInterface userInterface = new UserInterface(todoList, scanner);
        
        userInterface.start();

    }
}
