package ForLoop.Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameActor = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int countEvaluators = Integer.parseInt(scanner.nextLine());

        double totalPoints = pointsAcademy;
        for (int i = 1; i <= countEvaluators; i += 1) {
            String nameEvaluator = scanner.nextLine();
            double pointsEvaluator = Double.parseDouble(scanner.nextLine());

            double currentAssesPoints = (nameEvaluator.length() * pointsEvaluator) / 2;

            if (totalPoints < 1250.5) {
                totalPoints = totalPoints + currentAssesPoints;
            }
        }

        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for " +
                    "leading role with %.1f!", nameActor, totalPoints);
        } else {
            double diff = 1250.5 - totalPoints;
            System.out.printf("Sorry, %s you need %.1f more!",
                    nameActor, diff);
        }
    }
}
