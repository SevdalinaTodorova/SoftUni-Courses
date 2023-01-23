package FirstStepsInCoding.Excercise2;

import java.util.Scanner;

public class SportTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int sumSec = first + second + third;
        int min = sumSec / 60;
        int result = sumSec % 60;
        if (result < 10) {
            System.out.printf("%d:0%d", min, result);
        } else {
            System.out.printf("%d:%d",min,result);

        }


    }
}
