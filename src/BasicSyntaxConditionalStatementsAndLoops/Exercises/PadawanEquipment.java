package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightsaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double lightsabersCount = Math.ceil(countStudents * 1.10);
        int beltsCount = countStudents - countStudents / 6;
        double totalPrice = lightsabersCount * priceLightsaber + priceRobe * countStudents + beltsCount * priceBelt;
        if (amountMoney >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalPrice);
        } else {
            double diff = totalPrice - amountMoney;
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }
    }
}
