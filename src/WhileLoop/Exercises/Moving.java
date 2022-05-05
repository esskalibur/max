package WhileLoop.Exercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthFreeSpace = Integer.parseInt(scanner.nextLine());
        int higthFreeSpace = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int cubicMeters = widthFreeSpace * lengthFreeSpace * higthFreeSpace;
        boolean isFreeSpace = false;
        while (!input.equals("Done")) {
            int currentSpace = Integer.parseInt(input);
            cubicMeters -= currentSpace;
            if (cubicMeters <= 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (cubicMeters >= 0) {
            isFreeSpace = true;
        }
        if (isFreeSpace){
            System.out.printf("%d Cubic meters left.%n",Math.abs(cubicMeters));
        }else{
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(cubicMeters));
        }
    }
}
