package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String nightType = "";
        double sum = 0;
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                sum = budget * 0.30;
                nightType = "Camp";
            } else if (season.equals("winter")) {
                sum = budget * 0.70;
                nightType = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                sum = budget * 0.40;
                nightType = "Camp";
            } else if (season.equals("winter")) {
                sum = budget * 0.80;
                nightType = "Hotel";
            }
            } else {
                destination = "Europe";
                sum = budget * 0.90;
                nightType = "Hotel";
            }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", nightType, sum);
        }
    }




