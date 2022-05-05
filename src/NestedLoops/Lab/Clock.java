package NestedLoops.Lab;

public class Clock {
    public static void main(String[] args) {
        for(int i=0;i<=23;i+=1){
            for(int j=0;j<=59;j+=1){
                System.out.printf("%d:%d%n",i,j);
            }
        }
    }
}
