package NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start=Integer.parseInt(scanner.nextLine());
        int finish=Integer.parseInt(scanner.nextLine());
        int magic=Integer.parseInt(scanner.nextLine());
        int count=0;
        boolean isFound=false;
        for(int i=start;i<=finish;i+=1){
            for(int j=start;j<=finish;j+=1){
                count+=1;
                if(i + j==magic){
                    System.out.printf("Combination N:%d (%d + %d = %d)",count,i,j,magic);
                    isFound=true;
                    break;
                }
            }
            if(isFound){
                break;
            }
        }
        if(!isFound){
            System.out.printf("%d combinations - neither equals %d",count,magic);
        }
    }
}
