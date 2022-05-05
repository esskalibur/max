package Arrays.Exercises;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]array=scanner.nextLine().split(" ");
        int rotations=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<rotations;i+=1){
            String firstElements= array[0];
            for(int j=0;j<array.length-1;j+=1){
                array[j]=array[j+1];
            }
            array[array.length-1]=firstElements;
        }
         System.out.println(String.join(" ",array));
    }
}
