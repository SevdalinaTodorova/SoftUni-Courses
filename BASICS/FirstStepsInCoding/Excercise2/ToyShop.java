package FirstStepsInCoding.Excercise2;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excPrice = Double.parseDouble(scanner.nextLine());
        int puzzels = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double purchaseSUM = puzzels * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
        double rent = purchaseSUM * 0.1;
        double totalIncome = purchaseSUM - rent;
        if ((puzzels + dolls + bears + minions + trucks) >= 50) {
            totalIncome = (purchaseSUM-rent) * 0.75;
        }
        if (totalIncome>=excPrice){
            System.out.printf("Yes! %.2f lv left.",totalIncome - excPrice);
        }else if (totalIncome<excPrice){
            System.out.printf("Not enough money! %.2f lv needed.",excPrice-totalIncome);
        }
    }
}

