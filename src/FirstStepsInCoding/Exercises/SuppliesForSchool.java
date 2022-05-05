package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитаме входа
        int countPens = Integer.parseInt(scanner.nextLine());
        int countMarkers = Integer.parseInt(scanner.nextLine());
        int litres = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        // Пресмятаме
        double pricePens = countPens * 5.80;
        double priceMarkers = countMarkers * 7.20;
        double priceLitres = litres * 1.20;
        double sum = pricePens + priceMarkers + priceLitres;
        // 25% = 0.25
        double priceWithDiscount = sum - (sum * percent/100);

        //Печатаме
        System.out.println(priceWithDiscount);


    }
}
