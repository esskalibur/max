package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // От конзолата се четат

        String nameArchitect = scanner.nextLine();
        int countProjects = Integer.parseInt(scanner.nextLine());

        // пресмятания
        int time = countProjects * 3;

        // На конзолата се отпечатва
        // "The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
        System.out.println("The architect " + nameArchitect + " will need " + time + " hours to complete " + countProjects + " project/s" + ".");
    }
}
