package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projectType = scanner.nextLine();
        int countOfRows = Integer.parseInt(scanner.nextLine());
        int countOfColumns = Integer.parseInt(scanner.nextLine());

        double priceOneTicket =0.0;
        if (projectType.equals("Premiere")) {
            priceOneTicket = 12.00;
        }else if (projectType.equals("Normal")) {
            priceOneTicket = 07.50;
        }else if (projectType.equals("Discount")) {
            priceOneTicket = 05.00;
        }
        double totalRevenue=(countOfRows*countOfColumns)*priceOneTicket;
        System.out.printf("%.2f leva",totalRevenue);


    }
    }
