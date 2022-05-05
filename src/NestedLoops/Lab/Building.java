package NestedLoops.Lab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRoomsOnFloor = Integer.parseInt(scanner.nextLine());

        for (int i = countFloors; i > 0; i -= 1) {
            for (int j = 0; j < countRoomsOnFloor; j += 1) {
                if (i == countFloors) {
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                } else {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println();
        }
    }
}
