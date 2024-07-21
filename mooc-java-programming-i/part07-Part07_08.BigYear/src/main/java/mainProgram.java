
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<String> engNames = new ArrayList<>();
        ArrayList<String> latNames = new ArrayList<>();
        ArrayList<Integer> observationCounts = new ArrayList<>();
        
        while (true) {
            System.out.println("?");
            String input = scan.nextLine();

            if (input.equals("Add")) {
                System.out.println("Name: ");
                String nameEng = scan.nextLine();
                engNames.add(nameEng);

                System.out.println("Name in Latin: ");
                String nameLat = scan.nextLine();
                latNames.add(nameLat);
                
                observationCounts.add(0);

            } else if (input.equals("Observation")) {
                System.out.println("Bird? ");
                String bird = scan.nextLine();

                if (engNames.contains(bird)) {
                    int index = engNames.indexOf(bird);
                    observationCounts.set(index, observationCounts.get(index) + 1);
                } else {
                    System.out.println("Not a bird!");
                }
            } else if (input.equals("All")) {
                for (int i = 0; i < engNames.size(); i++) {
                    System.out.println(engNames.get(i) + " (" + latNames.get(i) + "): " + observationCounts.get(i) + " observations");
                }
            } else if (input.equals("One")) {
                System.out.println("Bird? ");
                String bird = scan.nextLine();

                if (engNames.contains(bird)) {
                    int index = engNames.indexOf(bird);
                    System.out.println(engNames.get(index) + " (" + latNames.get(index) + "): " + observationCounts.get(index) + " observations");
                } else {
                    System.out.println("Not a bird!");
                }
            } else if (input.equals("Quit"))
                break;

        }

    }

}
