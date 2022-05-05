package ConditionalStatements.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //read
        double priceHoliday = Double.parseDouble(scanner.nextLine());
        int countPuzz = Integer.parseInt(scanner.nextLine());
        int countSpeakDolls = Integer.parseInt(scanner.nextLine());
        int countBears = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        //calculate
        //  Пъзел - 2.60 лв.
        //•	Говореща кукла - 3 лв.
        //•	Плюшено мече - 4.10 лв.
        //•	Миньон - 8.20 лв.
        //•	Камионче - 2 лв.
        double sum = (countPuzz * 2.60) + (countSpeakDolls * 3) + (countBears * 4.10) + (countMinions * 8.20) +
                (countTrucks * 2);
        int countToys = countPuzz + countSpeakDolls + countBears + countMinions + countTrucks;

        if (countToys >= 50) {
            sum = sum * 0.75;
        }
        sum = sum * 0.90;
        double diff = Math.abs(sum - priceHoliday);
        if (sum >= priceHoliday) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }

    }

}

