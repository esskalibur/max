package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Четем
        int lenght = Integer.parseInt(scanner.nextLine());
        int widht = Integer.parseInt(scanner.nextLine());
        int hight = Integer.parseInt(scanner.nextLine());
        double percentAcc=Double.parseDouble(scanner.nextLine());

        //изчисляваме
//        обем на аквариумa: 85 * 75 * 47 = 299625 см3
//        обем в литри: 299625 * 0.001 или  299625 / 1000 => 299.625 литра
//        заето пространство: 17% = 0.17
//        нужни литри: 299.625 * (1 - 0.17) = 248.68875 литра
        //Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.
        int capacityAquarium=lenght*widht*hight;
        double capacityLitres=capacityAquarium/1000.0;
        double needLitres=(capacityLitres-(capacityLitres*percentAcc/100.0));

        System.out.println(needLitres);


    }
}
