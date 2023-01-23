package FirstStepsInCoding.Excercise4;

import java.util.Scanner;

public class Trecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numGroups = Integer.parseInt(scanner.nextLine());
        int musalaPeople = 0;
        int monblancPeople = 0;
        int kilimandjaroPeople = 0;
        int k2People = 0;
        int everestPeople = 0;
        int allPeople = 0;

        for (int i = 1; i <= numGroups; i++) {
            int numPeople = Integer.parseInt(scanner.nextLine());

            if (numPeople <= 5) {
                musalaPeople += numPeople;
                allPeople += numPeople;
            } else if (numPeople >= 6 && numPeople <= 12) {
                monblancPeople += numPeople;
                allPeople += numPeople;
            } else if (numPeople >= 13 && numPeople <= 25) {
                kilimandjaroPeople += numPeople;
                allPeople += numPeople;
            } else if (numPeople >= 26 && numPeople <= 40) {
                k2People += numPeople;
                allPeople += numPeople;
            } else if (numPeople >= 41) {
                everestPeople += numPeople;
                allPeople += numPeople;
            }

        }
        System.out.printf("%.2f%%%n", (musalaPeople * 100.0) / allPeople);
        System.out.printf("%.2f%%%n", (monblancPeople * 100.0) / allPeople);
        System.out.printf("%.2f%%%n", (kilimandjaroPeople * 100.0) / allPeople);
        System.out.printf("%.2f%%%n", (k2People * 100.0) / allPeople);
        System.out.printf("%.2f%%%n", (everestPeople * 100.0) / allPeople);


    }
}
