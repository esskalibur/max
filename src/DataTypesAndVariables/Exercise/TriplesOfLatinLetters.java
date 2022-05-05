package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        for(int i=97;i<97+n;i+=1){
            for(int j=97;j<97+n;j+=1){
                for(int k=97;k<97+n;k+=1){
                    System.out.printf("%c%c%c%n",i,j,k);
                }
            }
        }
    }
}
