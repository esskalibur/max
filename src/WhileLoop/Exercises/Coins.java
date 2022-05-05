package WhileLoop.Exercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change= Double.parseDouble(scanner.nextLine());

        double coins=change*100;
        coins=Math.round(coins);
        double countCoins=0;
        while (coins>0){
            if(coins>=200){
                coins-=200;
                countCoins+=1;
            }else if(coins>=100){
                coins-=100;
                countCoins+=1;
            }else if(coins>=50){
                coins-=50;
                countCoins+=1;
            }else if(coins>=20){
                coins-=20;
                countCoins+=1;
            }else if(coins>=10){
                coins-=10;
                countCoins+=1;
            }else if(coins>=5){
                coins-=5;
                countCoins+=1;
            }else if(coins>=2){
                coins-=2;
                countCoins+=1;
            }else if(coins>=1){
                coins-=1;
                countCoins+=1;
            }
        }
        System.out.println(Math.round(countCoins));
    }
}
