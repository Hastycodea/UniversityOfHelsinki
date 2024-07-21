import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            if (input.equals("add")) {
                add();                
            }

            if (input.equals("list")) {
                list();                
            }
            
            if (input.equals("remove")) {
                remove();                
            }
            
            
        }
    }
    
    public void add() {
        System.out.println("To add: ");
        String input = scanner.nextLine();
        todoList.add(input);
    }
    
    public void list() {
        todoList.print();
    }
    
    public void remove() {
        System.out.println("Which one is removed? ");
        int number = Integer.valueOf(scanner.nextLine());
        todoList.remove(number);
    }
    
}
