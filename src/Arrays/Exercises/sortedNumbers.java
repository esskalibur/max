package Arrays.Exercises;

import java.util.*;

public class sortedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 6, 3, 7, 10, 12, 8));

        Collections.sort(numbers);
        Collections.reverse(numbers);

        for (Integer number : numbers) {
            System.out.print(number + " ");

        }
    }
}
