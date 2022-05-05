package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOne=Integer.parseInt(scanner.nextLine());
        int nTwo=Integer.parseInt(scanner.nextLine());
        int nThree=Integer.parseInt(scanner.nextLine());
        int nFour=Integer.parseInt(scanner.nextLine());

        int result=((nOne+nTwo)/nThree)*nFour;
         System.out.println(result);
    }
}
