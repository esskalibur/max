package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i += 1) {
            System.out.print(i +" ");
            sum+=i;
        }
         System.out.printf("%nSum: %d",sum);
    }
}
