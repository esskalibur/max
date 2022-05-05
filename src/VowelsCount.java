import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printVowelscount(text);
    }

    private static void printVowelscount(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i += 1) {
            char symbols = text.toLowerCase().charAt(i);
            if (symbols == 97 || symbols == 101 || symbols == 105 || symbols == 111 || symbols == 117|| symbols == 122) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
