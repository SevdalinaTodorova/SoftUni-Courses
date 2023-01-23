package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class SpaceShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widthShip = Double.parseDouble(scanner.nextLine());
        double lenghtShip = Double.parseDouble(scanner.nextLine());
        double heightShip = Double.parseDouble(scanner.nextLine());
        double avgHeightAstronauts = Double.parseDouble(scanner.nextLine());

        double spacePerAstronaut = 2 * 2 * (avgHeightAstronauts + 0.4);
        double shipVolume = widthShip * lenghtShip * heightShip;
        double maxAstronauts = Math.floor(shipVolume / spacePerAstronaut);

        if (maxAstronauts < 3) {
            System.out.println("The spacecraft is too small.");

        } else if (maxAstronauts > 10) {
            System.out.println("The spacecraft is too big.");

        } else {
            System.out.printf("The spacecraft holds %.0f astronauts.", maxAstronauts);
        }


    }
}
