package Exam;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople=Integer.parseInt(scanner.nextLine());
        int countNights=Integer.parseInt(scanner.nextLine());
        int countBilletsTrans=Integer.parseInt(scanner.nextLine());
        int countBilletsMuz=Integer.parseInt(scanner.nextLine());

        int sumNights=countNights*20;
        double sumTrans=countBilletsTrans*1.60;
        int sumBill=countBilletsMuz*6;
        double sumMan=sumNights+sumTrans+sumBill;
        double sumPeople=countPeople*sumMan;
        double sumContingencies=sumPeople+sumPeople*0.25;
        System.out.printf("%.2f",sumContingencies);
    }
}
