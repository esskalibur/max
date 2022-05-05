package ForLoop.Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageLili = Integer.parseInt(scanner.nextLine());
        double priceWashMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int countMoney = 0;
        int countToys = 0;
        int allMoney = 0;
        int countBrother = 0;
        for (int i = 1; i <= ageLili; i += 1) {
            if (i % 2 != 0) {
                countToys += 1;
            } else {
                countMoney += 10;
                allMoney += countMoney;
                countBrother += 1;
            }
        }
        int totalSum = allMoney + (countToys*priceToy) - countBrother;
        double diff = Math.abs(totalSum - priceWashMachine);
        if (totalSum >= priceWashMachine) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
