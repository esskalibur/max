package Arrays.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String >words=new ArrayList<>();
        words.add("Peter");
        words.add("Peter");
        words.add("Peter");
        List<String >words2=new ArrayList<>(Arrays.asList("Peter","Kaloyan","Ivan"));
        words2.remove("Ivan");

         System.out.println(words2);
    }
}
