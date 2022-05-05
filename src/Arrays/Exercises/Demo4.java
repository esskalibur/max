package Arrays.Exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>(Arrays.asList("abc", "abc", "def", "abc", "def"));

        removeAll(words, "def");

        for (String word : words) {
            System.out.print(words + " ");

        }

    }

    private static void removeAll(List<String> elements, String value) {
        int i = 0;
        while (i < elements.size()) {
            if ((elements.get(i).equals(value))) {
                elements.remove(i);
            } else {
                i++;
            }
        }
    }
}
