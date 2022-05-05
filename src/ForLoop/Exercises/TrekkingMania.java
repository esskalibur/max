package ForLoop.Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countClimbersGroup = Integer.parseInt(scanner.nextLine());

        double totalCountClimbers =0.0;
        int groupOne = 0;
        int groupTwo = 0;
        int groupThree = 0;
        int groupFour = 0;
        int groupFive = 0;

        for (int i = 1; i <= countClimbersGroup; i += 1) {
            int countPeopleInGroup = Integer.parseInt(scanner.nextLine());
            totalCountClimbers += countPeopleInGroup;
            if (countPeopleInGroup <= 5) {
                groupOne += countPeopleInGroup;
            } else if (countPeopleInGroup <= 12) {
                groupTwo += countPeopleInGroup;
            } else if (countPeopleInGroup <= 25) {
                groupThree += countPeopleInGroup;
            }else if (countPeopleInGroup <= 40) {
                groupFour += countPeopleInGroup;
            }else {
                groupFive += countPeopleInGroup;
            }
        }
        double peoplePerMusala=groupOne/totalCountClimbers*100;
        System.out.printf("%.2f%%%n",peoplePerMusala);
        double peoplePerMonblan=groupTwo/totalCountClimbers*100;
        System.out.printf("%.2f%%%n",peoplePerMonblan);
        double peoplePerKil=groupThree/totalCountClimbers*100;
        System.out.printf("%.2f%%%n",peoplePerKil);
        double peoplePerKTwo=groupFour/totalCountClimbers*100;
        System.out.printf("%.2f%%%n",peoplePerKTwo);
        double peoplePerEverest=groupFive/totalCountClimbers*100;
        System.out.printf("%.2f%%%n",peoplePerEverest);
    }
}
