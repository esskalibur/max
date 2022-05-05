package RegularExpressions.Exercises;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyRegex = "[starSTAR]";
        Pattern keyPattern = Pattern.compile(keyRegex);

        String nameRegex = "^[^@\\-!:>]*@(?<planet>[A-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<count>\\d+)[^@\\-!:>]*$";
        Pattern messagePattern = Pattern.compile(nameRegex);
        List<String> attack = new LinkedList<>();
        List<String> destroy = new LinkedList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();
            Matcher keyMatcher = keyPattern.matcher(message);
            int count = 0;
            while (keyMatcher.find()) {
                count += 1;
            }
            StringBuilder sb = new StringBuilder(message);
            for (int j = 0; j < sb.length(); j += 1) {
                int newChar = sb.charAt(j) - count;
                sb.setCharAt(j, (char) newChar);
            }
            // System.out.println(sb.toString());
            Matcher messageMatcher = messagePattern.matcher(sb.toString());
            while (messageMatcher.find()) {
                String namePlanet = messageMatcher.group("planet");
                String population = messageMatcher.group("population");
                String attackType = messageMatcher.group("attackType");
                int countType = Integer.parseInt(messageMatcher.group("count"));
                if (attackType.equals("A")) {
                    attack.add(namePlanet);
                } else {
                    destroy.add(namePlanet);
                }
            }
        }
        System.out.printf("Attacked planets: %s%n",attack.size());
        attack.stream().sorted(String::compareTo).forEach(p -> System.out.printf("-> %s%n", p));
        System.out.printf("Destroyed planets: %s%n",destroy.size());
        destroy.stream().sorted(String::compareTo).forEach(p -> System.out.printf("-> %s%n", p));
    }
}
