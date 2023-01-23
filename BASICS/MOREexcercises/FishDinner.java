package MOREexcercises;

import java.util.Scanner;

public class FishDinner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double skumria$ = Double.parseDouble(scanner.nextLine());
        double caca$ = Double.parseDouble(scanner.nextLine());
        double palamudKG = Double.parseDouble(scanner.nextLine());
        double safridKG = Double.parseDouble(scanner.nextLine());
        int shellsKG = Integer.parseInt(scanner.nextLine());
        double palamud$ = skumria$ * 1.6;
        double safrid$ = caca$ * 1.8;

        double total = palamudKG * palamud$ + safrid$ * safridKG + shellsKG * 7.50;
        System.out.printf("%.2f", total);

    }
}
