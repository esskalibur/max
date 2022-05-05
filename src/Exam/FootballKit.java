package Exam;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceTshirt= Double.parseDouble(scanner.nextLine());
        double sumToReachTheBall= Double.parseDouble(scanner.nextLine());

        double priceShorts=priceTshirt*0.75;
        double priceSokcs=priceShorts*0.20;
        double priceButt=(priceTshirt+priceShorts)*2;
        double totalSum=priceTshirt+priceShorts+priceSokcs+priceButt;
        double totalSumWithDiscount=totalSum-(totalSum*0.15);

        double diff=Math.abs(sumToReachTheBall-totalSumWithDiscount);
        if(totalSumWithDiscount>sumToReachTheBall){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.",totalSumWithDiscount);
        }else{
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.",diff);
        }
    }
}
