package WhileLoop.Exercises;

import java.util.Scanner;

public class ExamPreparationM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());
        double sumGrades = 0;
        int countPoorGrades = 0;
       int sumNumberOfProblems = 0;
        String lastProblem = "";
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                countPoorGrades += 1;
            }
            if (countPoorGrades >= poorGrades) {
                break;
            }
            sumGrades += grade;
            sumNumberOfProblems += 1;
            lastProblem = inputLine;

            inputLine = scanner.nextLine();
        }
        double avgScore = sumGrades / sumNumberOfProblems;
        if(inputLine.equals("Enough")){
            System.out.printf("Average score: %.2f%n",avgScore);
            System.out.printf("Number of problems: %d%n",sumNumberOfProblems);
            System.out.printf("Last problem: %s%n",lastProblem);
        }else{
            System.out.printf("You need a break, %d poor grades.",countPoorGrades);
        }
    }
}


