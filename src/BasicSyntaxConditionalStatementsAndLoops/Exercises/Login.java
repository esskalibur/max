package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        int count=0;
        String input= scanner.nextLine();
        while (true){
            count+=1;
            if(input.equals(password)){
                System.out.printf("User %s logged in.",username);
                break;
            }else{
                if(count==4){
                    System.out.printf("User %s blocked!",username);
                    break;
                }
                input= scanner.nextLine();
            }
            System.out.println("Incorrect password. Try again.");
        }
    }
}

