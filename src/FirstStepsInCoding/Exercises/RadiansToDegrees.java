package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Четем
        double radians=Double.parseDouble(scanner.nextLine());

        //пресмятаме
        // градус = радиан * 180 / π
        double degrees=radians*180/Math.PI;

        //принтираме
        System.out.println(degrees);
    }
}
