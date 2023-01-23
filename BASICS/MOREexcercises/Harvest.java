package MOREexcercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int allSqM = Integer.parseInt(scanner.nextLine());
        double grapesKgPerSqM = Double.parseDouble(scanner.nextLine());
        int neededWineLitres = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());


        double grapesKgAll = (allSqM*0.4)*grapesKgPerSqM;
        double wineProduction = grapesKgAll/2.5;


        if (wineProduction<neededWineLitres){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(neededWineLitres-wineProduction));

        }else if (wineProduction>=neededWineLitres){
            double litresPerPerson = (wineProduction-neededWineLitres)/workers;

            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.floor(wineProduction));
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(wineProduction-neededWineLitres),
                    Math.ceil(litresPerPerson));

        }





    }
}
