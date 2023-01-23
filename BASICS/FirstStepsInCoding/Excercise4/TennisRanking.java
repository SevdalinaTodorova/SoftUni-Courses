package FirstStepsInCoding.Excercise4;

import java.util.Scanner;

public class TennisRanking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberTournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int tournamentPoints = 0;
        int winningsCount = 0;

        for (int i = 1; i <= numberTournaments; i++) {
            String result = scanner.nextLine();
            switch (result) {
                case "W":
                    winningsCount += 1;
                    tournamentPoints += 2000;
                    break;
                case "F":
                    tournamentPoints += 1200;
                    break;
                case "SF":
                    tournamentPoints += 720;
                    break;
            }


        }
        double averagePoints = tournamentPoints * 1.0 / numberTournaments;

        System.out.printf("Final points: %d%n", (startPoints + tournamentPoints));
        System.out.printf("Average points: %.0f%n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", (winningsCount * 100.0) / numberTournaments);


    }

}
