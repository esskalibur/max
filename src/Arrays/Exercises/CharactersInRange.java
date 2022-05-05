package Arrays.Exercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character1=scanner.nextLine().charAt(0);
        char character2=scanner.nextLine().charAt(0);
        printCharactersInRange(character1,character2);

    }

    private static void printCharactersInRange(char character1, char character2) {
        if(character1>character2){
            char temp=character1;
            character1=character2;
            character2=temp;
        }
        for(int i=character1+1;i<character2;i+=1){
            System.out.printf("%c ",i);

        }
    }
}
