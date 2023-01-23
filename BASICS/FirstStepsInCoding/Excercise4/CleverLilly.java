package FirstStepsInCoding.Excercise4;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWM = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        double savings = 0;
        double giftSum = 0;

        for (int birthday = 1; birthday <= age; birthday++) {

            if (birthday % 2 == 0) {
                giftSum += 10;
                savings += giftSum - 1;

            } else {
                countToys++;


            }
        }
        double totalMoney = savings + priceToy * countToys;

        if (priceWM <= totalMoney) {
            System.out.printf("Yes! %.2f", totalMoney - priceWM);
        } else {
            System.out.printf("No! %.2f", priceWM - totalMoney);
        }


    }
}
