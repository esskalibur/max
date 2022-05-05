package ConditionalStatements.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double recSec= Double.parseDouble(scanner.nextLine());
        double distanceInM = Double.parseDouble(scanner.nextLine());
        double timeInSecForOneMeters = Double.parseDouble(scanner.nextLine());

        double allTime=distanceInM*timeInSecForOneMeters;
        double resistanceTime=Math.floor(distanceInM/15)*12.5;
        double totalTimePlusResistance=allTime+resistanceTime;
        if(totalTimePlusResistance<recSec){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTimePlusResistance);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",totalTimePlusResistance-recSec);
        }
    }
}
