package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();
        int grade = 1;
        int poorGrade = 0;
        double allGrades = 0;
        while (grade <= 12) {
            if (poorGrade == 2) {
                break;
            }
            double yearGrade = Double.parseDouble(scanner.nextLine());
            if (yearGrade < 4) {
                poorGrade += 1;
                continue;
            }
            allGrades += yearGrade;
           grade+=1;
        }
        double averageGrade=allGrades/12;
        if (grade > 12) {
            System.out.printf("%s graduated. Average grade: %.2f",student,averageGrade);
        }else{
            System.out.printf("%s has been excluded at %d grade",student,grade);
        }
    }
}
