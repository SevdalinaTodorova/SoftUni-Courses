package FirstStepsInCoding.Excercise3;

import java.util.Scanner;

public class FishBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //: "Spring", "Summer", "Autumn", "Winter"


        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countMen = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
                price = 4200;
                break;
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;

        }
        if (countMen <= 6) {
            price = price * 0.9;

        }
        if (countMen > 7 && countMen <= 11) {
            price = price * 0.85;

        }
        if (countMen > 12) {
            price = price * 0.75;
        }
        if (countMen % 2 == 0 && (season.equals("Winter")|| season.equals("Spring")|| season.equals("Summer"))) {
            price = price * 0.95;

        }
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);

        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }


    }
}
