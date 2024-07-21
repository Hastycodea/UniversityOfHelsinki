
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");           
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            int value = size - i;
            printSpaces(value);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 1; i <= height; i++) {
            int value = height - i;
            int range = (i * 2) - 1;
                        
            if (range % 2 == 1) {
                printSpaces(value);
                printStars(range);
            }
        }
        int baseSpace = height - 2; 
        printSpaces(baseSpace);
        printStars(3);
        printSpaces(baseSpace);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printTriangle(1);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
