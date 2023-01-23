package FirstStepsInCoding.Excercise6;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int sumPrimeNum = 0;
        int sumNonPrimeNum = 0;


        while (!input.equals("stop")) {
            int currentNum = Integer.parseInt(input);
            boolean isPrimeNum = true;
            if (currentNum < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;

            }
            for (int i = 2; i < currentNum; i++) {
                if (currentNum % i == 0) {
                    isPrimeNum = false;
                    break;
                }

            }
            if (isPrimeNum) {
                sumPrimeNum += currentNum;
            } else {
                sumNonPrimeNum += currentNum;
            }
            input = scanner.nextLine();

        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNum);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrimeNum);


    }
}

