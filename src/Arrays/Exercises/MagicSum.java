package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i += 1) {
            for (int j = i + 1; j < arr.length; j += 1) {
                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
