package FirstStepsInCoding.LAB5;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxNum = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {

            int currentNum = Integer.parseInt(input);

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
            input = scanner.nextLine();

        }
        System.out.println(maxNum);

    }


}
