package FirstStepsInCoding.LAB5;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regUsername = scanner.nextLine();
        String regPass = scanner.nextLine();
        String inputPass = scanner.nextLine();

        while (!inputPass.equals(regPass)) {
            inputPass = scanner.nextLine();

        } System.out.printf("Welcome %s!",regUsername);

    }

}



