package ComplexLoops.Lab;

import java.util.Scanner;

public class BreakSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasToEnd = false;
        for (int i = 1; i <= 3; i += 1) {
            if (hasToEnd == false) {
                for (int j = 3; j >= 1; j -= 1) {
                    if (i + j == 2) {
                        hasToEnd = true;
                        break;
                    }
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}

