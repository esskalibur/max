package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четем
        int squareMetresNaylon = Integer.parseInt(scanner.nextLine());
        int litresPaint = Integer.parseInt(scanner.nextLine());
        int litresDiluent = Integer.parseInt(scanner.nextLine());
        int hoursForFinishWork = Integer.parseInt(scanner.nextLine());

        //изчисляваме
//                Сума за найлон: (10 + 2) * 1.50 = 18 лв.
//                Сума за боя: (11 + 10%) * 14.50 = 175.45 лв.
//                Сума за разредител: 4 * 5.00 = 20.00 лв.
//                Сума за торбички: 0.40 лв.
//                Обща сума за материали: 18 + 175.45 + 20.00 + 0.40 = 213.85 лв.
//                Сума за майстори: (213.85 * 30%) * 8 = 513.24 лв.
//                Крайна сума: 213.85 + 513.24 = 727.09 лв.

        double sumNaylon = (squareMetresNaylon + 2) * 1.50;
        double sumPaint = (litresPaint + (litresPaint * 0.10)) * 14.50;
        double sumDilvent = litresDiluent * 5.00;
        double priceForMatherials = sumNaylon + sumPaint + sumDilvent + 0.40;

        double sumForMasters = (priceForMatherials * 0.30) * hoursForFinishWork;
        double fullPrice = priceForMatherials + sumForMasters;

        //Отпечатване
        System.out.println(fullPrice);


    }
}
