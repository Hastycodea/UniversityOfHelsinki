
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

    }
}
