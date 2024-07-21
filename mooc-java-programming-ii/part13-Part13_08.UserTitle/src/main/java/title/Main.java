package title;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a title
        System.out.println("Enter a title for the window:");
        
        // Read the title from the command line
        String title = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Set the title in UserTitle
        UserTitle.setWindowTitle(title);
        
        // Launch the JavaFX application
        UserTitle.launch(UserTitle.class);
    }
}

