package Arrays.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadFromConsole1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>namesList= Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
         System.out.println(namesList);
    }
}
