package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double priceKiloVeg = Double.parseDouble(scanner.nextLine());
        double priceKiloFr = Double.parseDouble(scanner.nextLine());
        int allKiloVeg = Integer.parseInt(scanner.nextLine());
        int allKiloFr = Integer.parseInt(scanner.nextLine());

        double priceVeg=priceKiloVeg*allKiloVeg;
        double priceFr=priceKiloFr*allKiloFr;
        double allPrice=(priceVeg+priceFr)/1.94;

        System.out.printf("%.2f",allPrice);

    }
}
