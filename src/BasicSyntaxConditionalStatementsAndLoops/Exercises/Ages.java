package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age= scanner.nextInt();
        String person="";

        if(0<=age&&age<=2){
            person="baby";
        }else if(3<=age&&age<=13) {
            person = "child";
        }else if(14<=age&&age<=19) {
            person = "teenager";
        }else if(20<=age&&age<=65) {
            person = "adult";
        }else {
            person = "elder";
        }
         System.out.println(person);
    }
}
