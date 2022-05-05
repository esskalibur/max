package ForLoop.Exercises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int nums = Integer.parseInt(scanner.nextLine());
            sum += nums;
            if (nums > maxNum) {
                maxNum = nums;
            }
        }
        int sumWithoutMaxNum = sum - maxNum;
        int diff = Math.abs(maxNum-sumWithoutMaxNum);
        if (maxNum == sumWithoutMaxNum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithoutMaxNum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
