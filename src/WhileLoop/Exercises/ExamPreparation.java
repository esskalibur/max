package WhileLoop.Exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorGrades = Integer.parseInt(scanner.nextLine());

        int countPoorGrades = 0;
        double sumGrades = 0;
        int countProblems = 0;
        String lastProblem = "";
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                countPoorGrades++;
            }
            if (countPoorGrades >= poorGrades) {
                break;
            }

            sumGrades = sumGrades + grade;
            countProblems++;

            lastProblem = inputLine;

            inputLine = scanner.nextLine();
        }

        double avgGrade = sumGrades / countProblems;
        if (inputLine.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", avgGrade);
            System.out.printf("Number of problems: %d%n", countProblems);
            System.out.printf("Last problem: %s%n", lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.%n", countPoorGrades);
        }
    }
}
