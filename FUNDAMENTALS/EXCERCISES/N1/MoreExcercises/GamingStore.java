package EXCERCISES.N1.MoreExcercises;

import java.util.Scanner;

public class GamingStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();
        double spentBudget = 0;

        while (!input.equals("Game Time")) {

            if (spentBudget == budget) {
                break;
            }
            double gamePrice = 0;

            switch (input) {
                case "OutFall 4":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;

                default:
                    gamePrice = 0;
                    System.out.println("Not found");
                    break;

            }

            if (gamePrice <= (budget - spentBudget) && gamePrice != 0) {

                System.out.printf("Bought %s%n", input);

                spentBudget += gamePrice;

            } else if (gamePrice > (budget - spentBudget) && gamePrice != 0) {
                System.out.println("Too Expensive");

            }
            input = scanner.nextLine();

        }
        if (budget == spentBudget) {
            System.out.println("Out of  money!");

        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentBudget, budget - spentBudget);
        }


    }
}
