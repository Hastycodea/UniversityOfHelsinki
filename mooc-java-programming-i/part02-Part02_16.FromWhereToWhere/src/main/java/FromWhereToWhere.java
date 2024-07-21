
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
//        System.out.println("Where to? ");
//        int number = Integer.valueOf(scanner.nextLine());
//        
//        for (int i = 1; i <= number; i++) {
//            System.out.println(i);
//        }
        
        System.out.println("Where to?");
        int dest = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        int src = Integer.valueOf(scanner.nextLine());
        
        for (int i = src; i <= dest; i++) {
            System.out.println(i);
        }
        
        
    }
}
