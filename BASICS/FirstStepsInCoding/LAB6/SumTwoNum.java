package FirstStepsInCoding.LAB6;

import java.util.Scanner;

public class SumTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int numComb = 0;
        boolean isValidComb = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                numComb++;
                int sum = i + j;

                if (sum == magicNum) {

                    System.out.printf("Combination N:%d ", numComb);
                    System.out.printf("(%d + %d = %d)", i, j, sum);
                    isValidComb = true;
                    break;
                }

            }
            if (isValidComb) {
                break;

            }


        }
        if (!isValidComb) {
            System.out.printf("%d combinations - neither equals %d", numComb, magicNum);


        }

    }
}





