package DrawFigures.Exercises;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String firstAndLastRow=repeatStr("*",n*2)
                +repeatStr(" ",n)
                +repeatStr("*",n*2);
                System.out.println(firstAndLastRow);

                for(int row=0;row<n-2;row+=1){
                    String middleRow ="*"
                            +repeatStr("/",n*2-2)
                            +"*";

                    if(row==(n-1)/2-1){
                        middleRow+=repeatStr("|",n);
                    }else {
                        middleRow+=repeatStr(" ",n);
                    }
                     middleRow +="*"
                            +repeatStr("/",n*2-2)
                            +"*";

                     System.out.println(middleRow);

                }
                 System.out.println(firstAndLastRow);

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i += 1) {
            text += strToRepeat;
        }
        return text;

    }
}
