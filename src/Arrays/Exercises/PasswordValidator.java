package Arrays.Exercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

//   	"Password must be between 6 and 10 characters";
        isBetween6And10Characters(pass);
//   	"Password must consist only of letters and digits";
        isConsistOnlyOfLettersAndDigits(pass);
//      "Password must have at least 2 digits".
        isHaveAtLeast2Digits(pass);
        if (isBetween6And10Characters(pass) && isConsistOnlyOfLettersAndDigits(pass) && isHaveAtLeast2Digits(pass)) {
            System.out.println("Password is valid");
        }
        if (!isBetween6And10Characters(pass)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isConsistOnlyOfLettersAndDigits(pass)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isHaveAtLeast2Digits(pass)) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    private static boolean isHaveAtLeast2Digits(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i += 1) {
            char symbols = pass.charAt(i);
            if (symbols >= 48 && symbols <= 57) {
                count += 1;
            }
        }
        return count >= 2;
    }

    private static boolean isConsistOnlyOfLettersAndDigits(String pass) {
        for (int i = 0; i < pass.length(); i += 1) {
            char symbol = pass.toLowerCase().charAt(i);
            if ((symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)) {
                return false;
            }

        }
        return true;
    }

    private static boolean isBetween6And10Characters(String pass) {
        return pass.length() >= 6 && pass.length() <= 10;
    }
}
