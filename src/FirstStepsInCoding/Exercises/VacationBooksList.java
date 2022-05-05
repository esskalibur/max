package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // Прочитаме
        int numberPages=Integer.parseInt(scanner.nextLine());
        int numberPagesPerHour=Integer.parseInt(scanner.nextLine());
        int numberDays=Integer.parseInt(scanner.nextLine());

        //Пресмятаме
        int allTime=numberPages/numberPagesPerHour;
        int needTimeADay=allTime/numberDays;

        //Печатим
        System.out.println(needTimeADay);
    }
}
