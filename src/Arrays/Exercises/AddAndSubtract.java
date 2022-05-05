package Arrays.Exercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());
        int j = sumFirstTwoNums(num1 + num2);
        int i = subtractResult(num3);
        int result = (num1+num2)-num3;
         System.out.println(result);



    }

    private static int subtractResult(int num3) {
        return num3;
    }

    private static int sumFirstTwoNums(int i) {
        return i;
    }

}
