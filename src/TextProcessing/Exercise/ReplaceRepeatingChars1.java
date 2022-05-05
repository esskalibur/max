package TextProcessing.Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb=new StringBuilder(scanner.nextLine());
        for(int i=0;i<sb.length()-1;i+=1){
            char currentDigit = sb.charAt(i);
            char nextDigit = sb.charAt(i + 1);
            if(currentDigit==nextDigit){
                sb.deleteCharAt(i);
                i-=1;
            }
        }
        System.out.println(sb);
    }
}
