package EXCERCISES.N1;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;
        double currentBill = 0;
        double priceProduct = 0;

        while (!input.equals("Start")) {

            double currentCoin = Double.parseDouble(input);

            if (currentCoin == 0.1 || currentCoin == 0.2 || currentCoin == 0.5 ||
                    currentCoin == 1.0 || currentCoin == 2.0) {
                sum += currentCoin;

            } else {
                System.out.printf("Cannot accept %.2f%n", currentCoin);

            }
            input = scanner.nextLine();
        }

        while (input.equals("Start")) {

            String product = scanner.nextLine();

            if (product.equals("End")) {
                break;
            }

            switch (product) {
                case "Nuts":
                    priceProduct = 2.0;
                    break;
                case "Water":
                    priceProduct = 0.7;
                    break;
                case "Crisps":
                    priceProduct = 1.5;
                    break;
                case "Soda":
                    priceProduct = 0.8;
                    break;
                case "Coke":
                    priceProduct = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    priceProduct = 0;
                    break;

            }
            if (priceProduct <= (sum - currentBill) && priceProduct != 0) {
                currentBill += priceProduct;
                System.out.printf("Purchased %s%n", product);


            } else if (priceProduct > (sum - currentBill) && priceProduct != 0) {
                System.out.println("Sorry, not enough money");

            }
        }
        System.out.printf("Change: %.2f", sum - currentBill);


    }
}
