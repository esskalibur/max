package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане
        String nameArchitect = scanner.nextLine();
        int countOfProjects = Integer.parseInt(scanner.nextLine());

        //Пресмятания
        int needHours = countOfProjects * 3;

        // печатане
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", nameArchitect, needHours, countOfProjects);

    }
}
