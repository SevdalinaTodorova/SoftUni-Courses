package MOREexcercises;

import java.util.Scanner;

public class PipesInPool {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1Hourly = Integer.parseInt(scanner.nextLine());
        int p2Hourly = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double totalL = (p1Hourly+p2Hourly)*hours;
        double totalPercent = (totalL/v)*100;
        double p1Percent = (p1Hourly*hours*100)/totalL;
        double p2Percent = (p2Hourly*hours*100)/totalL;

        if (totalL>v){
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",hours,totalL-v);
        }
        else {

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",totalPercent,p1Percent,p2Percent);

        }






    }

}
