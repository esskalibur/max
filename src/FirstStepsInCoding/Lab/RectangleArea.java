package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Прочитаме две цели числа от конзолата
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        //Пресмятане лицето на правоъгълника
        int area = a * b;
        // Принтиране на резултата
        System.out.println(area);


    }
}
