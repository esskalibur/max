package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetsCount = lostGamesCount / 2;
        double mousesCount = lostGamesCount / 3;
        double keyboardsCount = lostGamesCount / 6;
        double displaysCount = lostGamesCount / 12;
        double totalprice = headsetsCount * headsetPrice + mousesCount * mousePrice +
                keyboardsCount * keyboardPrice + displaysCount * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", totalprice);

    }
}
