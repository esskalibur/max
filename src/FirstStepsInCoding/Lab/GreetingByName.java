package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // прочитане на данни от конзолата
        String name = scanner.nextLine();

        // принтиране на конзолата
        // отпечатва "Hello, <name>!"

        System.out.println("Hello, " + name + "!");


    }
}
