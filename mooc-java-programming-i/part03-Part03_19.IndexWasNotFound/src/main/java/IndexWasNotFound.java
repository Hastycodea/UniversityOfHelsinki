
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        // Implement the search functionality here
//        System.out.print("Search for? ");
//        int result = Integer.valueOf(scanner.nextLine());
        int result = scanner.nextInt();

        boolean isThere = false;
        for (int i = 0; i < array.length; i++) {
            if (result == array[i]) {
                isThere = true;
                System.out.println(result + " is at index " + i + ".");
                break;
            }
        }
        if (!isThere) {        
            System.out.println(result + " was not found.");
        }

    }

}
