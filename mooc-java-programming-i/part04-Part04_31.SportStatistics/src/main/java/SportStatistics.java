
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

//String[] parts = line.split(",");
//String homeTeam = parts[0];
//String visitingTeam = parts[1];
//int homePoints = Integer.valueOf(parts[2]);
//int visitPoints = Integer.valueOf(parts[3]);
public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("File: ");
        String fileName = scan.nextLine();

        System.out.println("Team: ");
        String teamInput = scan.nextLine();

        int count = 0;
        int wins = 0;
        int loss = 0;
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                list.add(line);
                String parts[] = line.split(",");
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                if (parts.length > 0 && (parts[0].equals(teamInput) || parts[1].equals(teamInput))) {
                    count++;
                }
                if ((parts[0].equals(teamInput) && homeScore > awayScore) || (parts[1].equals(teamInput) && homeScore < awayScore)) {
                    wins++;
                }
                if ((parts[0].equals(teamInput) && homeScore < awayScore) || (parts[1].equals(teamInput) && homeScore > awayScore)) {
                    loss++;
                }

            }
            // System.out.println("Games: " + count);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loss);

    }

}

