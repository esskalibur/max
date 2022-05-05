package ComplexLoops.Lab;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int f0 = 1;
        int f1 = 1;
        for(int i=2;i<=n;i+=1){
            int temp=f0;
            f0=f1;
            f1=temp+f0;
        }
         System.out.println(f1);
    }
}
