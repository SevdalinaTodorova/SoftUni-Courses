package MOREexcercises;

import java.util.Scanner;

public class SleepyTom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holidays = Integer.parseInt(scanner.nextLine());
        int totalPlayTime =holidays*127 + (365-holidays)*63;
        int totalHoursDiff = Math.abs((30000-totalPlayTime)/60);
        int totalMinDiff = Math.abs((30000-totalPlayTime)%60);



        if (totalPlayTime<30000){
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",totalHoursDiff,totalMinDiff );
        }
        else {

            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",totalHoursDiff,totalMinDiff);
        }



    }
}
