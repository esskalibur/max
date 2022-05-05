package ComplexLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double budget= Double.parseDouble(scanner.nextLine());
            double money=0;
            while (money<budget){
                double currentSum= Double.parseDouble(scanner.nextLine());
                money+=currentSum;
            }
            System.out.printf("Going to %s!%n",destination);
            destination= scanner.nextLine();
        }
    }
}
