package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четем
        int yearTax = Integer.parseInt(scanner.nextLine());

        //изчисляваме
//        Цена на тренировките за година: 365-
//        Цена на баскетболните кецове: 365 – 40% = 219-
//        Цена на баскетболен екип: 219 – 20% = 175.20-
//        Цена на баскетболна топка: 1 / 4 от 175.20 = 43.80-
//        Цена на баскетболни аксесоари: 1 /  5 от 43.80 = 8.76-
//        Обща цена за екипировката: 365 + 219 + 175.20 + 43.80 + 8.76 = 811.76

        double priceShoes = yearTax * 0.60;
        double priceSuit=priceShoes*0.80;
        double priceBall=priceSuit/4;
        double priceAksesoars=priceBall/5;
        double fullpriceEquipment=yearTax+priceShoes+priceSuit+priceBall+priceAksesoars;

        System.out.println(fullpriceEquipment);

    }
}
