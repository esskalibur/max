package TextProcessing.Exercise;

import java.util.Scanner;

public class StringExplosion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        int strength = 0;
        for (int i = 0; i < sb.length(); i += 1) {
            if (strength > 0 && sb.charAt(i) != '>') {
                sb.deleteCharAt(i);
                strength--;
                i--;
            } else if (sb.charAt(i) == '>') {
                strength += Integer.parseInt(String.valueOf(sb.charAt(i+1)));
            }
        }
        System.out.println(sb);
    }
}
