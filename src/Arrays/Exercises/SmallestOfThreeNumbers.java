package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n1=Integer.parseInt(scanner.nextLine());
       int n2=Integer.parseInt(scanner.nextLine());
       int n3=Integer.parseInt(scanner.nextLine());

        int smallestNum = getSmallestNum(n1, n2, n3);
         System.out.println(smallestNum);

    }

    private static int getSmallestNum(int n1, int n2, int n3) {
        int [] nums={n1,n2,n3};
        Arrays.sort(nums);
        return nums[0];
    }
}

