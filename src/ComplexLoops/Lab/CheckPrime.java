package ComplexLoops.Lab;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        boolean isPrime=n>=2;
        for(int i=2;i<=n-1;i+=1){
            if(n%i==0){
                 isPrime=false;
                 break;
            }
        }
        if(isPrime){
             System.out.println("Prime");
        }else {
             System.out.println("Not Prime");
        }
    }
}
