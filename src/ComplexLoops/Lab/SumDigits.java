package ComplexLoops.Lab;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
       int result=0;

       do{
           int remainder=n%10;
           n=n/10;
           result+=remainder;
       }while (n>0);
        System.out.println(result);
    }
}
