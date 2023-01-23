package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class GoldMine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLocation = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= countLocation; i++) {

            double allGoldResults = 0;

            double expectedDailyresult = Double.parseDouble(scanner.nextLine());
            int daysPerLocation = Integer.parseInt(scanner.nextLine());


            for (int j = 1; j <= daysPerLocation; j++) {
                double realDailyresult = Double.parseDouble(scanner.nextLine());

                allGoldResults += realDailyresult;

            }
            double avgDailyResult = allGoldResults / daysPerLocation;

            if (avgDailyResult >= expectedDailyresult) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", avgDailyResult);


            } else {

                System.out.printf("You need %.2f gold.%n", expectedDailyresult - avgDailyResult);
            }



        }


    }

}

