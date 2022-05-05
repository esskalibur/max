package Arrays.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>(Arrays.asList("abc", "def", "abc", "abc"));

        removeAll(words, "abc");

        for (String word : words) {
            System.out.print(word + " ");

        }


    }

    private static void removeAll(List<String> elements, String value) {
        int i = 0;
        while (i < elements.size()) {
            if (elements.get(i).equals(value)) {
                elements.remove(i);
            } else {
                i+=1;
            }
        }
    }
}
