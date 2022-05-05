package RegularExpressions.Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line =scanner.nextLine();
        String regex="(?<=\\s)([A-z0-9]+[-\\._]*)*@([A-z]+[\\.\\-][A-z]{2,}.[a-z]+)";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(line);
        while ((matcher.find())){
            System.out.println(matcher.group());
        }
    }
}
