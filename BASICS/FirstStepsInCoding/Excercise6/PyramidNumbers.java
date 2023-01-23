package FirstStepsInCoding.Excercise6;

import java.util.Scanner;

public class PyramidNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentNum = 1;

        for (int rows = 1; rows <= n; rows++) {
            for (int colm = 1; colm <= rows; colm++) {
                System.out.print(currentNum + " ");
                currentNum++;

                if (currentNum > n) {
                    break;
                }
            }
            if (currentNum > n) {
                break;
            }
            System.out.println();


        }


    }

}

