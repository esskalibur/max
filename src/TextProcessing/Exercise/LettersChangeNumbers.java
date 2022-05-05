package TextProcessing.Exercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double sum = 0;
        for (String s : input) {
            char letterBefore = s.charAt(0);
            char letterAfter = s.charAt(s.length() - 1);
            String digits = s.substring(1, s.length() - 1);
            double num = Double.parseDouble(digits);
            int letterBeforePosition = getAlphabeticPosition(letterBefore);
            int letterAfterPosition = getAlphabeticPosition(letterAfter);
            if (Character.isUpperCase(letterBefore)) {
                sum += num / letterBeforePosition;
            } else {
                sum += num * letterBeforePosition;
            }
            if (Character.isUpperCase(letterAfter)) {
                sum -= letterAfterPosition;
            } else {
                sum += letterAfterPosition;
            }
        }
        System.out.printf("%.2f", sum);
    }

    static int getAlphabeticPosition(char c) {
        return Character.toLowerCase(c) - 96;
    }
}
