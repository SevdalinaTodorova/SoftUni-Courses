package EXCERCISES.N2;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYield = Integer.parseInt(scanner.nextLine());

        int daysInMine = 0;
        int extractedSpice = 0;
        int dailyYield = startYield;

        while (dailyYield >= 100) {
            extractedSpice = extractedSpice - 26;
            extractedSpice += dailyYield;
            daysInMine++;
            dailyYield = dailyYield - 10;
        }

        System.out.println(daysInMine);
        if (extractedSpice>=26){
            extractedSpice-=26;
        }
        System.out.println(extractedSpice );


    }
}
