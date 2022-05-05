package WhileLoop.Exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthInSm = Integer.parseInt(scanner.nextLine());
        int lengthInSm = Integer.parseInt(scanner.nextLine());

        int countPieces = widthInSm * lengthInSm;
        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int currentPiece = Integer.parseInt(input);
            countPieces -= currentPiece;
            if (countPieces <= 0) {
                break;
            }
            input = scanner.nextLine();
        }

        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.%n", Math.abs(countPieces));
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countPieces));
        }
    }
}
