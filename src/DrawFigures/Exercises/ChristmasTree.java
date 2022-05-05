package DrawFigures.Exercises;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for(int row=0;row<n+1;row+=1){
            String spaces=repeatStr(" ",n-row);
            String stars=repeatStr("*",row);

            String currentRow=spaces+stars+" | "+stars;
            System.out.println(currentRow);
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
