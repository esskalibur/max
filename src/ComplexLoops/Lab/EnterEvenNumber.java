package ComplexLoops.Lab;

import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        while (true) {
            System.out.print("Enter even number: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n % 2 == 0) {
                break;
            }
            System.out.println("the number is not even");
        }
        System.out.printf("even number entered: %d", n);
    }
}