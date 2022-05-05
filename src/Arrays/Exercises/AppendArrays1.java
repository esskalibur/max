package Arrays.Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(arrays);
        String print=arrays.toString().replaceAll("[\\[\\]\\,]","");
        print=print.replaceAll("\\s+"," ");
         System.out.println(print);


    }
}
