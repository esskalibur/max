package DrawFigures.Exercises;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < n; row += 1) {
            for (int col = 1; col < n - row; col += 1) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 0; col < row; col += 1) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int row = 0; row < n - 1; row += 1) {
            for (int col = 1; col <= row + 1; col += 1) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 0; col < n - row - 2; col += 1) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

