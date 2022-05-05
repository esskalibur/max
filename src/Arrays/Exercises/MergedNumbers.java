package Arrays.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sortedA = new ArrayList<>(Arrays.asList(9, 7, 3, 4, 6));
        List<Integer> sortedB = new ArrayList<>(Arrays.asList(10, 7, 8, 4, 1, 4));
        int indexA = 0;
        int indexB = 0;
        List<Integer> merged = new ArrayList<>();
        while ((indexA < sortedA.size()-1 && indexB < sortedB.size()-1)) {
            int a = sortedA.get(indexA);
            int b = sortedB.get(indexB);
            if (a > b) {
                merged.add(a);
                indexA+=1;
            } else {
                merged.add(b);
                indexB+=1;
            }
        }
        for (Integer integer : merged) {
            System.out.print(merged + " ");

        }


    }
}
