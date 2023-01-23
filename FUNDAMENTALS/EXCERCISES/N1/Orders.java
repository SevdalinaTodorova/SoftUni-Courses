package EXCERCISES.N1;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalprice = 0;

        for (int i = 1; i <= n; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double pricePerOrder = pricePerCapsule * daysInMonth * capsulesCount;
            System.out.printf("The price for the coffee is: $%.2f%n", (pricePerOrder));
            totalprice += pricePerOrder;
        }
        System.out.printf("Total: $%.2f", totalprice);


    }
}
