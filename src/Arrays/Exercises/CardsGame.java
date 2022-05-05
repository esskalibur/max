package Arrays.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String[] initial1 = input1.split(" ");
        String input2 = scanner.nextLine();
        String[] initial2 = input2.split(" ");
        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        for (int i = 0; i < initial1.length; i++) {
            player1.add(Integer.parseInt(initial1[i]));
        }
        for (int i = 0; i < initial2.length; i++) {
            player2.add(Integer.parseInt(initial2[i]));
        }
        while (player1.size() > 0 && player2.size() > 0) {
            if (player1.get(0) > player2.get(0)) {
                player1.add(player1.get(0));
                player1.add(player2.get(0));
                player1.remove(0);
                player2.remove(0);
            } else if (player2.get(0) > player1.get(0)) {
                player2.add(player2.get(0));
                player2.add(player1.get(0));
                player1.remove(0);
                player2.remove(0);
            } else {
                player1.remove(0);
                player2.remove(0);
            }
        }
        int sum = 0;
        if (player1.size() == 0) {
            for (Integer card : player2) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (Integer card : player1) {
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
