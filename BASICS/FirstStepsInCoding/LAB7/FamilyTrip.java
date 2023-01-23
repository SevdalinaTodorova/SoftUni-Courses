package FirstStepsInCoding.LAB7;

import java.util.Scanner;

public class FamilyTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceNight = Double.parseDouble(scanner.nextLine());
        int extraCostsPercent = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            priceNight = priceNight * 0.95;
        }

        double accPrice = nights*priceNight;
        double otherExpences = budget*extraCostsPercent/100;
        double allCosts = accPrice + otherExpences;

        if (budget>=allCosts){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget-allCosts);

        }
        else {
            System.out.printf("%.2f leva needed.",allCosts-budget);
        }


    }
}
