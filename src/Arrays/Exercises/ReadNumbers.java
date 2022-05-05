package Arrays.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>nums= Arrays.stream(scanner.nextLine().split(" \\s+")).map(Integer::parseInt).collect(Collectors.toList());
    }
}
