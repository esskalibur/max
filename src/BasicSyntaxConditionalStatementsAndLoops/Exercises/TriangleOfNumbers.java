package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i += 1) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
             System.out.println();
        }
    }
}
