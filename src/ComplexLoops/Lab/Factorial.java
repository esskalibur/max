package ComplexLoops.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int fact=1;

        do{
            fact=fact*n;
            n-=1;
        }while (n>1);
             System.out.println(fact);
    }
}
