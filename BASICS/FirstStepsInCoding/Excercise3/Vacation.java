package FirstStepsInCoding.Excercise3;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String vacationType = "abc";
        String destination = "abc";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                budget = budget * 0.3;
                vacationType = "Camp";
            }
            if (season.equals("winter")) {
                budget = budget * 0.7;
                vacationType = "Hotel";
            }

        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                budget = budget * 0.4;
                vacationType = "Camp";
            }
            if (season.equals("winter")) {
                budget = budget * 0.8;
                vacationType = "Hotel";

            }
        } else if (budget > 1000) {
            destination = "Europe";
            vacationType = "Hotel";
            budget = budget * 0.9;
        }
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",vacationType,budget);


    }
}
