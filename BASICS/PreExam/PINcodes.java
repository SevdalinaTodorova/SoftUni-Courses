package PreExam;

import java.util.Scanner;

public class PINcodes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int digit1limit = Integer.parseInt(scanner.nextLine());
        int digit2limit = Integer.parseInt(scanner.nextLine());
        int digit3limit = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 7; j++) {
                for (int k = 1; k <= 9; k++) {

                    if (i % 2 == 0 && k % 2 == 0 && (j == 2 || j % 2 != 0)) {

                        if (i <= digit1limit && j <= digit2limit && k <= digit3limit) {
                            System.out.printf("%d %d %d%n", i, j, k);
                        }


                    }


                }

            }


        }


    }
}

