package Exam;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysForStay = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String evaluation = scanner.nextLine();

        double priceRooms = 0.0;
        double priceTrip = 0;
        boolean isPositive = true;
        switch (typeRoom) {
            case "room for one person":
                if (daysForStay < 10) {
                    priceRooms = 18;
                } else if (daysForStay <= 15) {
                    priceRooms = 18;
                } else {
                    priceRooms = 18;
                }
                break;
            case "apartment":
                if (daysForStay < 10) {
                    priceRooms = 25 * 0.7;
                } else if (daysForStay <= 15) {
                    priceRooms = 25 * 0.65;
                } else {
                    priceRooms = 25 * 0.5;
                }
                break;
            case "president apartment":
                if (daysForStay < 10) {
                    priceRooms = 35 * 0.9;
                } else if (daysForStay <= 15) {
                    priceRooms = 35 * 0.75;
                } else {
                    priceRooms = 35 * 0.8;
                }
                break;
        }
        priceTrip = (daysForStay - 1) * priceRooms;
        if ("positive".equals(evaluation)) {
            priceTrip = priceTrip * 1.25;
        } else {
            priceTrip = priceTrip * 0.9;
        }
        System.out.printf("%.2f", priceTrip);
    }
}
