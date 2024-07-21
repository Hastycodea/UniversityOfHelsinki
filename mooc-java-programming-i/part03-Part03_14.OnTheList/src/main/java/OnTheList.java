
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for? ");
        String result = scanner.nextLine();
        
        boolean found = false;
        
        for (int i = 0; i < list.size(); i++) {
            if (result.equals(list.get(i))) {
                found = true;
                break;
            }            
        }
        // printing
        if (found) {
            System.out.println(result + " was found!");            
        } else {
            System.out.println(result + " was not found");
        }
        

            
        

    }
}
