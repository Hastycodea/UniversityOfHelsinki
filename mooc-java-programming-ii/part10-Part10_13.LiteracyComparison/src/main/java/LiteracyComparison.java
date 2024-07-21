
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LiteracyComparison {

    public static void main(String[] args) {

        ArrayList<String> rows = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("literacy.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String gender = parts[2].trim().split(" ")[0];
                String value = parts[3] + " (" + parts[4] + "), " + gender + ", " + parts[5];
                rows.add(value);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Collections.sort(rows, (String row1, String row2) -> {
            double literacyRate1 = Double.valueOf(row1.split(",")[2].trim());
            double literacyRate2 = Double.valueOf(row2.split(",")[2].trim());
            return Double.compare(literacyRate1, literacyRate2);
        });
        
        for (String row : rows) {
            System.out.println(row);
        }

    }
}
