package FirstStepsInCoding.LAB5;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("NoMoreMoney")) {
            double currentAmount = Double.parseDouble(input);

            if (currentAmount < 0) {
                System.out.printf("Invalid operation!%n");
                break;
            }

            System.out.printf("Increase: %.2f%n", currentAmount);

            sum = sum + currentAmount;

            input = scanner.nextLine();


            } System.out.printf("Total: %.2f", sum);



        }



    }




