package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четем
        int chikenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegMenu = Integer.parseInt(scanner.nextLine());

//изчисляваме
//        Цена за пилешките менюта: 2 броя * 10.35  = 20.70
//        Цена за менютата с риба: 4 броя * 12.40 = 49.60
//        Цена за вегетарианските менюта: 3 броя * 8.15 = 24.45
//        Обща цена на менютата: 20.70 + 49.60 + 24.45 = 94.75
//        Цена на десерта: 20% от 94.75 = 18.95
//        Цена на доставка: 2.50 (по условие)
//        Обща цена на поръчката: 94.75 + 18.95 + 2.50 = 116.20

        double priceChiken = chikenMenu * 10.35;
        double priceFish = fishMenu * 12.40;
        double priceVeg = vegMenu * 8.15;
        double menuPrice = priceChiken + priceFish + priceVeg;
        double priceDessert=menuPrice*0.20;
        double priceOrder=menuPrice+priceDessert+2.50;

        //Отпечатване
        System.out.println(priceOrder);




    }
}
