package MapsLambdaAndStreamAPI.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Ivan", "12345");
        phoneBook.put("Sophia", "111111");
        phoneBook.put("Peter", "122111");


        phoneBook.forEach((key, value) -> System.out.printf("Name: %s , Phone: %s%n", key, value));
    }
}
