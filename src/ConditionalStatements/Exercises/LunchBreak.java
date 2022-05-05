package ConditionalStatements.Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameSerial = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int allRestDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = allRestDuration/8.0;
        double restTime = allRestDuration/4.0;
        double timeLeft = allRestDuration - lunchTime - restTime;

        double diff=Math.abs(timeLeft-episodeDuration);
        if (timeLeft >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameSerial,Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameSerial,Math.ceil(diff));
        }
    }
}
