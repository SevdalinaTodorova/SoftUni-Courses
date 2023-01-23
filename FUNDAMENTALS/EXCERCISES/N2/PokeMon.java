package EXCERCISES.N2;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int startPower = pokePower;
        int pokedTargets = 0;

        while (pokePower >= distance) {
            pokePower = pokePower - distance;
            pokedTargets++;

            if (pokePower == startPower / 2) {
                if (exhaustionFactor != 0) {
                    pokePower = pokePower / exhaustionFactor;
                }

            }


        }
        System.out.println(pokePower);
        System.out.println(pokedTargets);


    }
}
