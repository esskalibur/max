package Arrays.Exercises;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }

    private static void printMatrix(int n) {
        for(int r=0;r<n;r+=1){
            for(int c=0;c<n;c+=1){
                 System.out.print(n+" ");
            }
             System.out.println();
        }
    }
}
