package DrawFigures.Exercises;

import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < n; row += 1) {
            System.out.print("$");
            for (int col = 0; col < row; col += 1) {
                System.out.print(" $");
            }
            System.out.println();
        }
    }
}
