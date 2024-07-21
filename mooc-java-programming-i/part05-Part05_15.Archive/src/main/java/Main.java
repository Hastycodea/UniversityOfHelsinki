
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            boolean exists = false;

            for (String item : list) {
                if (item.startsWith(identifier + ": ")) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                list.add(identifier + ": " + name);
            }

//            if (list.contains(identifier + ": " + name)) {
//            } else {
//                list.add(identifier + ": " + name);
//            }
        }

        for (String idName : list) {
            System.out.println(idName);
        }

    }
}
