package DrawFigures.Exercises;

import java.util.Scanner;

public class Buterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String row = "";

        for (int i = 0; i < n - 2; i += 1) {
            if (i % 2 == 0) {
                row=repeatStr("*",n-2)
                        + "\\ /"
                        +repeatStr("*",n-2);
            }else {
                row=repeatStr("-",n-2)
                        + "\\ /"
                        +repeatStr("-",n-2);
            }
             System.out.println(row);
        }
        String middleRow=repeatStr(" ",n-1)
                +"@"
                + repeatStr(" ",n-1);
         System.out.println(middleRow);

        for (int i = 0; i < n - 2; i += 1) {
            if (i % 2 == 0) {
                row=repeatStr("*",n-2)
                        + "/ \\"
                        +repeatStr("*",n-2);
            }else {
                row=repeatStr("-",n-2)
                        + "/ \\"
                        +repeatStr("-",n-2);
            }
            System.out.println(row);
        }
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i += 1) {
            text += strToRepeat;
        }
        return text;
    }
}
