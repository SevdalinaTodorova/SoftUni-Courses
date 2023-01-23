package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int countPerson = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double pricePerHour = 0;

        if (month.equals("march") || month.equals("april") || month.equals("may")) {

            if (dayOrNight.equals("day")) {
                pricePerHour = 10.50;

            } else if (dayOrNight.equals("night")) {
                pricePerHour = 8.40;
            }

        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {

            if (dayOrNight.equals("day")) {
                pricePerHour = 12.60;

            } else if (dayOrNight.equals("night")) {
                pricePerHour = 10.20;
            }

        }
        if (countPerson >= 4) {
            pricePerHour = pricePerHour * 0.9;
        }
        if (hours >= 5) {
            pricePerHour = pricePerHour * 0.5;
        }

        System.out.printf("Price per person for one hour: %.2f%n", pricePerHour);
        System.out.printf("Total cost of the visit: %.2f", pricePerHour * hours * countPerson);


    }
}
