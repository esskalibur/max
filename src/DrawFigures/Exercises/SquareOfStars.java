package DrawFigures.Exercises;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i += 1) {
            System.out.print("*");
            for (int j = 0; j < n-1; j += 1) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
