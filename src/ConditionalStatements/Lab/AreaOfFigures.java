package ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fig = scanner.nextLine();
        //, rectangle, circle или triangle
        double area = 0;
        if (fig.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            area = Math.pow(a, 2);
        } else if (fig.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        } else if (fig.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * Math.pow(r,2);
        } else if (fig.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = a * h / 2;

        }
        System.out.printf("%.3f", area);
    }
}

