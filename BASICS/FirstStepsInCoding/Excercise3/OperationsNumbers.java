package FirstStepsInCoding.Excercise3;

import java.util.Scanner;

public class OperationsNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0.0;

        String evenOrOdd = "";

        switch (operator) {
            case "+":
                result = n1 + n2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, evenOrOdd);

                break;

            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, evenOrOdd);

                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";

                }
                System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, evenOrOdd);
                break;

            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = (n1 * 1.0) / n2;
                    System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);
                }
                break;

            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%d %s %d = %.0f", n1, operator, n2, result);
                }
                break;

        }


    }
}


