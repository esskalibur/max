import java.util.Arrays;
import java.util.Scanner;

public class LargestOfThreeNumbers {
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
        for(int i=0;i<nums.length/2;i+=1){
            int temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
        return nums[0];
    }
}
