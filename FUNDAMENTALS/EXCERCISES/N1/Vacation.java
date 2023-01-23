package EXCERCISES.N1;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int person = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.00;


        switch (day) {
            case "Friday":
                switch (typeGroup) {
                    case "Students":
                        price = 8.45;
                        break;
                    case "Business":
                        price = 10.90;
                        break;
                    case "Regular":
                        price = 15.00;
                        break;
                }
                break;

            case "Saturday":
                switch (typeGroup) {
                    case "Students":
                        price = 9.80;
                        break;
                    case "Business":
                        price = 15.60;
                        break;
                    case "Regular":
                        price = 20.00;
                        break;
                }
                break;

            case "Sunday":
                switch (typeGroup) {
                    case "Students":
                        price = 10.46;
                        break;
                    case "Business":
                        price = 16.00;
                        break;

                    case "Regular":
                        price = 22.50;
                        break;
                }
                break;

        }
        double totalSum = price*person;

        if (typeGroup.equals("Students") && person >= 30) {
            totalSum = totalSum * 0.85;
        }
        else if (typeGroup.equals("Business") && person >= 100) {
            totalSum = totalSum * 0.9;
        }
        else if (typeGroup.equals("Regular") && person >= 10 && person <= 20) {
            totalSum = totalSum * 0.95;
        }

        System.out.printf("Total price: %.2f", (totalSum));


    }
}
