package FirstStepsInCoding.LAB1;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане на данни
        //Храната се пазарува от зоомагазин, като
        // една опаковка храна за кучета е на цена 2.50 лв, а опаковка храна за котки струва 4 лв
        int dogfood = Integer.parseInt(scanner.nextLine());
        int catfood = Integer.parseInt(scanner.nextLine());
        // изчисления
        double totalprice = dogfood * 2.5 + catfood * 4;
        // Принтиране
        System.out.printf("%f lv.", totalprice);

    }
}
