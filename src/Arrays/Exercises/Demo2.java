package Arrays.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(11);
        nums.add(12);
        int x=0;
        nums.remove(x);
        for (Integer num : nums) {
            System.out.println(num);
        }

    }
}
