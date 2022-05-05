package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPerson = Integer.parseInt(scanner.nextLine());
        String person = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;

        if (countPerson >= 100 && person.equals("Business")) {
            countPerson -= 10;
        }

        switch (person) {
            case "Students":
                if (day.equals("Friday")) {
                    price = countPerson * 8.45;
                    if (countPerson >= 30) {
                        price = countPerson * 8.45 * 0.85;
                    }
                } else if (day.equals("Saturday")) {
                    price = countPerson * 9.80;
                    if (countPerson >= 30) {
                        price = countPerson * 9.80 * 0.85;
                    }
                } else if (day.equals("Sunday")) {
                    price = countPerson * 10.46;
                    if (countPerson >= 30) {
                        price = countPerson * 10.46 * 0.85;
                    }
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    price = countPerson * 10.90;
                } else if (day.equals("Saturday")) {
                    price = countPerson * 15.60;
                } else if (day.equals("Sunday")) {
                    price = countPerson * 16;
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price = countPerson * 15;
                    if (countPerson >= 10 && countPerson <= 20) {
                        price = countPerson * 15 * 0.95;
                    }
                } else if (day.equals("Saturday")) {
                    price = countPerson * 20;
                    if (countPerson >= 10 && countPerson <= 20) {
                        price = countPerson * 20 * 0.95;
                    }
                } else if (day.equals("Sunday")) {
                    price = countPerson * 22.50;
                    if (countPerson >= 10 && countPerson <= 20) {
                        price = countPerson * 22.50 * 0.95;
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}