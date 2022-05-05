package ConditionalStatements.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetPetar = Double.parseDouble(scanner.nextLine());
        int countVideoCards = Integer.parseInt(scanner.nextLine());
        int countProcessors = Integer.parseInt(scanner.nextLine());
        int countRammemories = Integer.parseInt(scanner.nextLine());

//        •	Видеокарта – 250 лв./бр.
//•	         Процесор – 35% от цената на закупените видеокарти/бр.
//•	        Рам памет – 10% от цената на закупените видеокарти/бр.
//         Да се изчисли нужната сума за закупуване на материалите и да се пресметне дали бюджета ще му стигне.
        double sumVideoCards = countVideoCards * 250;
        double priceProcessor = sumVideoCards * 0.35;
        double sumProcessors = countProcessors * priceProcessor;
        double priceRammemory = sumVideoCards * 0.10;
        double sumRammemories = countRammemories * priceRammemory;
        double totalSum = sumVideoCards + sumProcessors + sumRammemories;
        if (countVideoCards > countProcessors) {
            totalSum = totalSum * 0.85;
        }
        if (budgetPetar >= totalSum) {
            double leftMoney = budgetPetar - totalSum;
            System.out.printf("You have %.2f leva left!", leftMoney);
        } else {
            double needMoney = totalSum - budgetPetar;
            System.out.printf("Not enough money! You need %.2f leva more!", needMoney);
        }

    }
}
