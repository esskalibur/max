package Arrays.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lineOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = lineOfNummbers(scanner);

        for (Integer number : numbers) {
            System.out.print(number + " ");

        }
    }

    private static List<Integer> lineOfNummbers(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsStrings = lineOfNumbers.split(" ");

        for (String s : numbersAsStrings) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }
}
