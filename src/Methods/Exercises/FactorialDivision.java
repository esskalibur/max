package Methods.Exercises;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", 1.0 * factorial(firstDigit) / factorial(secondDigit));
    }

    static long factorial(int digit) {
        long fact = 1;
        for (int i = 2; i <= digit; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
