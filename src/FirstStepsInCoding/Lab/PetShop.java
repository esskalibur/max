package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Четене
        int countofFoodForPets = Integer.parseInt(scanner.nextLine());
        int countofFoodForCats = Integer.parseInt(scanner.nextLine());

        //Пресмятане
        // една опаковка храна за кучета е на цена 2.50 лв,
        // една опаковка храна за котки струва 4 лв.
        double priceForOneFoodForPets = countofFoodForPets * 2.50;
        int priceForOneForCats = countofFoodForCats * 4;
        double allSum = priceForOneFoodForPets + priceForOneForCats;

        //Печатане
        System.out.println(allSum + " lv.");
    }
}
