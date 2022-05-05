package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //прочитаме
        double usd=Double.parseDouble(scanner.nextLine());

        //пресмятаме
        // 1 USD = 1.79549 BGN
        double bgn=usd*1.79549;

        //принтираме
        System.out.println(bgn);
    }
}
