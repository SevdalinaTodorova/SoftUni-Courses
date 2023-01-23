package FirstStepsInCoding.Excercise2;

import java.util.Scanner;

public class Godzilla_Kong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ако парите за декора и дрехите са повече от бюджета:
        // "Not enough money!"
        // "Wingard needs {парите недостигащи за филма} leva more."

        // Ако парите за декора и дрехите са по малко или равни на бюджета:
        // "Action!"
        // "Wingard starts filming with {останалите пари} leva left."
        // Резултатът трябва да е форматиран до втория знак след десетичната запетая.

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double pricePP = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double totalCostumes = pricePP * people;
        double costs = decor + totalCostumes;

        if (people > 150) {
            costs = totalCostumes * 0.9 + decor;

        }
        if (costs > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", costs - budget);

        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - costs);


        }
    }
}


