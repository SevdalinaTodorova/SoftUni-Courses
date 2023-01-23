package FirstStepsInCoding.Excercise2;

import java.util.Scanner;

public class WorldRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double result = distance * timeInSec;
        double slowdown = Math.floor(distance / 15) * 12.5;
        double FinalResult = result + slowdown;

        if (FinalResult >= record) {
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(record - FinalResult));
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", FinalResult);


        }


    }
}
