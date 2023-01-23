package FirstStepsInCoding.Excercise2;

import java.util.Scanner;

public class TimePlus15min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //чете час и минути; Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalMin = hours * 60 + minutes + 15;

        hours = totalMin / 60;
        minutes = totalMin % 60;

        if (hours > 23) {
            hours = 0;

        }

        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);


        }



    }
}


