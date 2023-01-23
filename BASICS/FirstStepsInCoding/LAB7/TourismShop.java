package FirstStepsInCoding.LAB7;

import java.util.Scanner;

public class TourismShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int items = 0;
        double sumProducts = 0;


        while (!input.equals("Stop")) {
            double priceProduct = Double.parseDouble(scanner.nextLine());
            items++;

            if (items % 3 == 0) {
                priceProduct = priceProduct * 0.5;
            }
            sumProducts += priceProduct;

            if (sumProducts > budget) {
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", items, sumProducts);

        } else {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", sumProducts - budget);
        }


    }


}
