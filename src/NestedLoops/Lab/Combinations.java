package NestedLoops.Lab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int countValid = 0;
        for (int x1 = 0; x1 <= n; x1 += 1) {
            for (int x2 = 0; x2 <= n; x2 += 1) {
                for (int x3 = 0; x3 <= n; x3 += 1) {
                    if (x1 + x2 + x3 == n) {
                        countValid += 1;
                    }
                }
            }
        }
        System.out.printf("%d%n", countValid);
    }
}

