package Exam;

import java.util.Scanner;

public class ExcursionSale2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seaCount = Integer.parseInt(scanner.nextLine());
        int mountainCount = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int profit = 0;
        boolean isSold=false;
        while (!input.equals("Stop")) {
            String currentInput= input;
            if (currentInput.equals("Stop")) {
                isSold=true;
                break;
            }
            if (currentInput == "sea" && seaCount != 0) {
                profit += 680;
                seaCount--;
                input= scanner.nextLine();
            }
             if (currentInput == "mountain" && mountainCount != 0) {
                profit += 499;
                mountainCount--;
                input= scanner.nextLine();
            }
            if (seaCount == 0 && mountainCount == 0) {
                break;
            }
        }
        if (isSold) {
            System.out.println("Good job! Everything is sold.");
            System.out.printf("Profit: %d leva.", profit);
        } else {
            System.out.printf("Profit: %d leva.", profit);
        }
    }
}
