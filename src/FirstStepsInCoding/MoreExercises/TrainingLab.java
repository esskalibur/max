package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lenght = Double.parseDouble(scanner.nextLine());
        double widht = Double.parseDouble(scanner.nextLine());
        double a = Math.floor(lenght * 100 / 120);
        double b = Math.floor((widht * 100 - 100) / 70);
        double res = (a * b) - 3;
        System.out.println(Math.floor(res));

    }
}
