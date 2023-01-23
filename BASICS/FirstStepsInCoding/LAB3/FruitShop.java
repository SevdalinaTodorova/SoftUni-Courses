package FirstStepsInCoding.LAB3;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        boolean WorkingDays = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Friday") || day.equals("Thursday");
        boolean WeekEnd = day.equals("Saturday") || day.equals("Sunday");
        boolean invalidData = false;

        if (WorkingDays) {
            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.20;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.7;
            } else if (fruit.equals("pineapple")) {
                price = 5.5;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            }else {
                invalidData = true;
            }


        } else if (WeekEnd){
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.9;
            } else if (fruit.equals("grapefruit")) {
                price = 1.6;
            } else if (fruit.equals("kiwi")) {
                price = 3.0;
            } else if (fruit.equals("pineapple")) {
                price = 5.6;
            } else if (fruit.equals("grapes")) {
                price = 4.2;
            } else {
                invalidData = true;
            }

        } if (!invalidData && (WorkingDays || WeekEnd)){
            System.out.printf("%.2f", price*quantity);

        }else {
            System.out.println("error");
        }

    }
}





