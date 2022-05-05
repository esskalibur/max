package Arrays.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        String word = scanner.nextLine();
        while (!word.equals(".")) {
            words.add(word);
            word = scanner.nextLine();
        }

        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.println(words.get(i));
        }
    }
}
