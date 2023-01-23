package PreExam;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String country = scanner.nextLine();
        double winSum = dancers * points;



        if (season.equals("summer")) {
            if (country.equals("Bulgaria")) {
                winSum = winSum*0.95;
            } else if (country.equals("Abroad")) {
                winSum = winSum * 1.5;
                winSum = winSum*0.9;

            }

        } else if (season.equals("winter")) {

            if (country.equals("Bulgaria")) {
                winSum = winSum * 0.92;
            } else if (country.equals("Abroad")) {
                winSum=winSum*1.5;
                winSum = winSum * 0.85;
            }
        }
        System.out.printf("Charity - %.2f%n", winSum*0.75);
        System.out.printf("Money per dancer - %.2f", (winSum - winSum*0.75)/dancers);


    }

}






