package FirstStepsInCoding.LAB5;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        while (sum < num) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;

        }
        System.out.printf("%d", sum);


    }
}
