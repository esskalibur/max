package ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //left nums
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            leftSum += number;
            //right nums
        }
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rightSum += number;
        }
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", rightSum);
        } else{
            System.out.printf("No, diff = %d",Math.abs(rightSum-leftSum));
        }
    }
}
