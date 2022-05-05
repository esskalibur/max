package Arrays.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> namesList = new ArrayList<>();
        String[] names = scanner.nextLine().split("\\s+");
        for (int i = 0; i < names.length; i++) {
            namesList.add(names[i]);
        }
         System.out.println(namesList);
    }
}
