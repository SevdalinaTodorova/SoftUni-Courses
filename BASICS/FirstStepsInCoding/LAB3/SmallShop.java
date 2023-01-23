package FirstStepsInCoding.LAB3;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;

        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                price = 0.5;
            }
            if (product.equals("water")) {
                price = 0.8;
            }
            if (product.equals("beer")) {
                price = 1.2;
            }
            if (product.equals("sweets")) {
                price = 1.45;
            }
            if (product.equals("peanuts")) {
                price = 1.6;
            }

        } else if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                price = 0.4;
            }
            if (product.equals("water")) {
                price = 0.7;
            }
            if (product.equals("beer")) {
                price = 1.15;
            }
            if (product.equals("sweets")) {
                price = 1.3;
            }
            if (product.equals("peanuts")) {
                price = 1.5;
            }
        } else if (city.equals("Varna")) {
            if (product.equals("coffee")) {
                price = 0.45;
            }
            if (product.equals("water")) {
                price = 0.7;
            }
            if (product.equals("beer")) {
                price = 1.1;
            }
            if (product.equals("sweets")) {
                price = 1.35;
            }
            if (product.equals("peanuts")) {
                price = 1.55;
            }
        }
        System.out.printf("%f",price*quantity);


    }
}

