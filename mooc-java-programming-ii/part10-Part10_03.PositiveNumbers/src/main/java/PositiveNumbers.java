
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        ArrayList<Integer> values = new ArrayList<>();
        values.add(7);
        values.add(3);
        values.add(2);
        values.add(1);

        int sum = values.stream()
                .reduce(7, (previousSum, value) -> previousSum + value);
        System.out.println(sum);

    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> values = numbers.stream()
                .filter(value -> value >= 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return values;
    }

}
