package Exam;

import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaCount=Integer.parseInt(scanner.nextLine());
        int mountainCount=Integer.parseInt(scanner.nextLine());

        String input= scanner.nextLine();
       int profit = 0;
        String inputLine = "";

        while (true)
        {
            inputLine = scanner.nextLine();
            if (inputLine == "Stop")
            {
                break;
            }
            if (inputLine == "sea" && seaCount != 0)
            {
                profit += 680;
                seaCount--;
            }
            else if (inputLine == "mountain" && mountainCount != 0)
            {
                profit += 499;
                mountainCount--;
            }

            if (seaCount == 0)
                if (mountainCount == 0)
                    break;
            if (mountainCount == 0)
                if (seaCount == 0)

                    break;
        }
        if (inputLine.equals("Stop")){
            System.out.println("Good job! Everything is sold.");
            System.out.printf("Profit: %d leva.",profit);
        }
        else {
            System.out.printf("Profit: %d leva.",profit);
        }
    }
}
