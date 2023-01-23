package FirstStepsInCoding.Excercise1;

import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Предпазен найлон - 1.50 лв. за кв. метър
        // Боя - 14.50 лв. за литър
        // Разредител за боя - 5.00 лв. за литър
        // За всеки случай, към необходимите материали,
        // Румен иска да добави още 10% от количеството боя и 2 кв.м. найлон,
        // разбира се и 0.40 лв. за торбички.
        // Сумата, която се заплаща на майсторите за 1 час работа,
        // е равна на 30% от сбора на всички разходи за материали.

        int meters = Integer.parseInt(scanner.nextLine());
        int paintLitres = Integer.parseInt(scanner.nextLine());
        int litres = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        // изчисления
        double naylonSum = (meters + 2) * 1.50;
        double paintSum = (paintLitres * 1.1) * 14.50;
        double litresSum = litres * 5.00;
        double SumMat = naylonSum + paintSum + litresSum + 0.4;
        double workSum = (SumMat * 0.3) * hours;
        double costs = SumMat + workSum;

        //изходни данни
        System.out.println(costs);


    }
}
