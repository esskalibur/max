package WhileLoop.Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        double finalSum = availableMoney;
        int countDays = 0;
        int spendingCount = 0;
        boolean isFelt = false;
        while (finalSum < neededMoney) {
            if (spendingCount == 5) {
                isFelt = true;
                break;
            }
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            countDays+=1;
            if (action.equals("save")) {
                spendingCount = 0;
                finalSum += amount;
            } else {
                spendingCount+=1;
                finalSum -= amount;
                if (finalSum < 0) {
                    finalSum = 0;
                }
            }
        }

        if (isFelt) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", countDays);
        } else {
            System.out.printf("You saved the money for %d days.",countDays);
        }
    }
}
