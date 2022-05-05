package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // прочитаме входа
        double deposit=Double.parseDouble(scanner.nextLine());
        int months=Integer.parseInt(scanner.nextLine());
        double percent=Double.parseDouble(scanner.nextLine());

        //пресмятаме
        // сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double increase=deposit*(percent/100);
        double monthlyIncrease=increase/12;
        double sum=deposit+(months*monthlyIncrease);

        // отпечатваме
        System.out.println(sum);

    }
}
