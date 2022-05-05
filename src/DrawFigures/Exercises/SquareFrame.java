package DrawFigures.Exercises;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String firstAndLastRow = "+";
        for (int col = 0; col < n - 2; col += 1) {
            firstAndLastRow += " -";
        }
        firstAndLastRow += " +";
        System.out.println(firstAndLastRow);

        String middleRows = "|";
        for (int rows = 0; rows < n-2; rows += 1) {
            middleRows += " -";
        }
        middleRows += " |";
        for(int i=0;i<n-2;i+=1) {
            System.out.println(middleRows);
        }
        System.out.println(firstAndLastRow);
    }
}
