package DrawFigures.Exercises;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        String firstRow="";
        for(int row=0;row<n;row+=1){

        }


    }static String repeatStr(String strToRepeat,int count){
        String text="";
        for(int i=0;i<count;i+=1){
            text+=strToRepeat;
        }
        return text;
    }
}
