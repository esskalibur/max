package ComplexLoops.Lab;

import java.util.Scanner;

public class HoursAndMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int multiPlayer = Integer.parseInt(scanner.nextLine());

        if (multiPlayer > 10) {
        }
        for (int i = multiPlayer; i <= 10; i += 1) {
            int counter = n * multiPlayer;
            System.out.printf("%d X %d = %d%n", n, i, counter);
        }
        multiPlayer+=1;
    }
}




