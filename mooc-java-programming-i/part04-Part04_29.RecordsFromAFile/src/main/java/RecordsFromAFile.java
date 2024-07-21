
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
                
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                
                int age = Integer.valueOf(parts[1]);
                String name = parts[0];
                
                System.out.println(name + ", " + " age: " + age + " years");
            }
        }
        catch (Exception e) {
            System.out.println("");
        }

    }
}
