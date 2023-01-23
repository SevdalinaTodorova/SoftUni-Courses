package FirstStepsInCoding.Excercise2;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int Vcards = Integer.parseInt(scanner.nextLine());
        int proc = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double VcardsSum = Vcards * 250.00;
        double proc$ = VcardsSum * 0.35;
        double ram$ = VcardsSum * 0.1;
        double totalSum = VcardsSum + proc$ * proc + ram * ram$;

        if (Vcards > proc) {
            totalSum = totalSum * 0.85;
        }
        if (totalSum <=  budget) {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
        }


    }
}
