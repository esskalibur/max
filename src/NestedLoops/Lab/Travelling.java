package NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination= scanner.nextLine();

        while (!destination.equals("End")){
            double neededBudget= Double.parseDouble(scanner.nextLine());
            int money=0;
            while (money<neededBudget){
                double currentMoney= Double.parseDouble(scanner.nextLine());
                money+=currentMoney;
            }
            System.out.printf("Going to %s!%n",destination);
            destination= scanner.nextLine();
        }
    }
}
