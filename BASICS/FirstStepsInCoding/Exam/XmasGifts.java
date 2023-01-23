package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class XmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int adults = 0;
        int children = 0;


        while (!input.equals("Christmas")) {
            int currentAge = Integer.parseInt(input);

            if (currentAge <= 16) {
                children++;
            } else {
                adults++;
            }

            input = scanner.nextLine();
        }
        double moneyToys = children * 5;
        double moneySweaters = adults * 15;

        System.out.printf("Number of adults: %d%n", adults);
        System.out.printf("Number of kids: %d%n", children);
        System.out.printf("Money for toys: %.0f%n", moneyToys);
        System.out.printf("Money for sweaters: %.0f%n", moneySweaters);


    }


}
