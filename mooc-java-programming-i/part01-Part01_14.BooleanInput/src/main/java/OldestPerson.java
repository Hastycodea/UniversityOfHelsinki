import java.util.Scanner;

public class OldestPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = Integer.MIN_VALUE;
        String currentLine;
        while (!(currentLine = scanner.nextLine()).isEmpty()) {
            String[] parts = currentLine.split(",");
            if (parts.length == 2) {
                int age = Integer.parseInt(parts[1].trim());
                if (age > maxAge) {
                    maxAge = age;
                }
            }
        }
        System.out.println("Age of the oldest: " + maxAge);
    }
}