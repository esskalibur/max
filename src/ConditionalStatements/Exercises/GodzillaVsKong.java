package ConditionalStatements.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetMovie = Double.parseDouble(scanner.nextLine());
        int countStatists = Integer.parseInt(scanner.nextLine());
        double priceDressForStatist = Double.parseDouble(scanner.nextLine());

        double priceForDecor = budgetMovie * 0.10;
        double priceForDresses = countStatists * priceDressForStatist;
        if (countStatists > 150) {
            priceForDresses = priceForDresses * 0.90;
        }
        double cost = priceForDecor + priceForDresses;
        double leftSum = Math.abs(cost-budgetMovie);
        if (cost <= budgetMovie) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", leftSum);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", leftSum);
        }
    }
}
