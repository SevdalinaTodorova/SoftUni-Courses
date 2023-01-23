package FirstStepsInCoding.Excercise1;

import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int veggie = Integer.parseInt(scanner.nextLine());
        double priceFood = chicken * 10.35 + fish * 12.40 + veggie * 8.15;
        double desert = 0.2 * priceFood;
        double finalPrice = priceFood + desert + 2.5;
        System.out.println(finalPrice);

    }
}
