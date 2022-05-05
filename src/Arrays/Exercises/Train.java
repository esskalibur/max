package Arrays.Exercises;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] train = new int[wagons];
        for (int i = 0; i < train.length; i += 1) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sum += train[i];
            System.out.print(train[i] + " ");
        }
        System.out.printf("\n%d", sum);
    }
}
