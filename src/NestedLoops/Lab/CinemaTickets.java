package NestedLoops.Lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int student = 0;
        int standard = 0;
        int kid = 0;
        int totalTickets = 0;
        while (!movie.equals("Finish")) {
            int freePlaces = Integer.parseInt(scanner.nextLine());
            //("student", "standard", "kid")
            String ticketType = scanner.nextLine();
            int soldTickets = 0;
            while (!ticketType.equals("End")) {
                soldTickets += 1;
                switch (ticketType) {
                    case "student":
                        student += 1;
                        break;
                    case "standard":
                        standard += 1;
                        break;
                    case "kid":
                        kid += 1;
                        break;
                }
                if (freePlaces == soldTickets) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            totalTickets += soldTickets;

            System.out.printf("%s - %.2f%% full.%n", movie, 1.0 * soldTickets / freePlaces * 100);
            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * student / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * standard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", 1.0 * kid / totalTickets * 100);
    }
}


