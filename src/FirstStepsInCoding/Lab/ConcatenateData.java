package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитаме входа
        // "You are <firstName> <lastName>, a <age>-years old person from <town>."

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        // печатане
        System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + town + ".");


    }
}
