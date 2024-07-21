
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            String input = scanner.nextLine();
            int number = Integer.valueOf(input);
            numbers.add(number);

            if (number == -1) {
                break;
            }
        }

        double averageAll = average(numbers);
        double averagePassing = passingAverage(numbers);
        double passingPercentage = passingPercentage(numbers);

        System.out.println("Point average (all): " + averageAll);

        if (averagePassing > 0) {
            System.out.println("Point average (passing): " + passingAverage(numbers));
        } else {
            System.out.println("Point average (passing): -");
        }

        System.out.println("Pass percentage: " + passingPercentage);
        gradeDistribution(numbers);

    }

    public static double average(ArrayList<Integer> integers) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) >= 0 && integers.get(i) <= 100) {
                sum += integers.get(i);
                count++;
            }

        }
        return (sum * 1.0) / count;
    }

    public static double passingAverage(ArrayList<Integer> integers) {
        int sum = 0;
        int count = 0;
        double result = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) >= 50 && integers.get(i) <= 100) {
                sum += integers.get(i);
                count++;
            }
            result = sum * 1.0 / count;
        }
        return result;
    }

    public static double passingPercentage(ArrayList<Integer> integers) {
        int participants = 0;
        int passing = 0;
        double result = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) >= 50 && integers.get(i) <= 100) {
                passing++;
            }
            if (integers.get(i) >= 0 && integers.get(i) <= 100) {
                participants++;
            }
            result = 100 * (passing * 1.0 / participants);
        }
        return result;
    }

    public static void gradeDistribution(ArrayList<Integer> integers) {

        int[] gradeAdder = new int[6]; //array for holding counts 0-5

        for (int i = 0; i < integers.size(); i++) { // for (int grade:integers)
            if (integers.get(i) >= 0 && integers.get(i) <= 100) {
                if (integers.get(i) < 50) { // same as grade < 50
                    gradeAdder[0]++; 
                } else if (integers.get(i) < 60) {
                    gradeAdder[1]++;
                } else if (integers.get(i) < 70) {
                    gradeAdder[2]++;
                } else if (integers.get(i) < 80) {
                    gradeAdder[3]++;
                } else if (integers.get(i) < 90) {
                    gradeAdder[4]++;
                } else if (integers.get(i) >= 90) {
                    gradeAdder[5]++;
                }
            }
        }
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < gradeAdder[i]; j++) {
                System.out.print("*");                
            }
            System.out.println("");
        }
    }

}
