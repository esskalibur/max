package Arrays.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveAllNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(-2, 4, -3, 7, 6, -1));

        List<Integer> filtered = filternegative(numbers);
        for (Integer number : filtered) {
            System.out.print(number + " ");
        }

    }

    private static List<Integer> filternegative(List<Integer> numbers) {
        List<Integer> nonNegative = new ArrayList<>();
        for (int number : numbers) {
            if (number >= 0) {
                nonNegative.add(number);
            }

        }
        return nonNegative;
    }
}

