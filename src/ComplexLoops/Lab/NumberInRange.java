package ComplexLoops.Lab;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input=Integer.parseInt(scanner.nextLine());

        boolean isInputValid=(input<=0||input>100);
        while (isInputValid){
             System.out.println("Invalid number!");
             input=Integer.parseInt(scanner.nextLine());
            isInputValid=(input<=0||input>100);
        }
        System.out.printf("The number is: %d",input);
    }
}
