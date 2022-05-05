package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // прочитаме
        double area = Double.parseDouble(scanner.nextLine());

        //пресмятаме
        //Цената без отстъпката(цената на кв. м. е 7.61 лв със ДДС)
        double priceWithoutDiscount = area * 7.61;
        // изчисляваме отстъпката
        double discount = priceWithoutDiscount * 18 / 100;
        //18% отстъпка от крайната цена

        // Приспадаме отстъпката
        double finalPrice=priceWithoutDiscount-discount;

        //принтираме
         System.out.printf("The final price is: %f lv.%n"+"The discount is: %f lv.",finalPrice,discount);


    }
}
