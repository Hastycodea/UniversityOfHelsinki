
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        // write your code here
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int smallest = smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallest = table[startIndex];

        for (int i = startIndex; i < table.length; i++) {
            int value = table[i];
            if (value < smallest) {
                smallest = value;
            }
        }

        int index = 0;
        for (int i = 0; i < table.length; i++) {
            if (smallest == table[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int hold1 = array[index1];
        array[index1] = array[index2];
        array[index2] = hold1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallIndex);
        }
    }

}
