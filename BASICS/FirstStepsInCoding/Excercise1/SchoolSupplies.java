package FirstStepsInCoding.Excercise1;

import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        // химикали (5.8), маркери (7.20), препарат (1.20)
        // Цена на пакетите химикали
        //Цена на пакетите маркери
        //Цена на препарата
        //Цена за всички материали
        //Цена с намаление
        Scanner scanner = new Scanner(System.in);
        // променливи видове стоки
        int countPens = Integer.parseInt(scanner.nextLine());
        int countMarkers = Integer.parseInt(scanner.nextLine());
        int litres = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        // изчисления на сумите по стоки
        double pricePens = countPens * 5.8;
        double priceMarkers = countMarkers * 7.20;
        double priceLitres = litres * 1.20;
        double totalPrice = priceLitres + priceMarkers + pricePens;
        double finalPrice = totalPrice - ((discount/100.0)*totalPrice);
        //изходни данни
        System.out.println(finalPrice);





    }
}
