package FirstStepsInCoding.LAB7;

import java.util.Scanner;

public class Gymnastics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String objects = scanner.nextLine();
        double difficulty = 0;
        double performance = 0;


        if (country.equals("Russia")) {

            if (objects.equals("ribbon")) {
                difficulty = 9.100;
                performance = 9.400;

            } else if (objects.equals("hoop")) {
                difficulty = 9.30;
                performance = 9.80;

            } else if (objects.equals("rope")) {
                difficulty = 9.600;
                performance = 9.000;

            }


        } else if (country.equals("Bulgaria")) {

            if (objects.equals("ribbon")) {
                difficulty = 9.600;
                performance = 9.400;

            } else if (objects.equals("hoop")) {
                difficulty = 9.550;
                performance = 9.750;

            } else if (objects.equals("rope")) {
                difficulty = 9.500;
                performance = 9.400;

            }


        } else if (country.equals("Italy")) {

            if (objects.equals("ribbon")) {
                difficulty = 9.200;
                performance = 9.500;

            } else if (objects.equals("hoop")) {
                difficulty = 9.450;
                performance = 9.350;

            } else if (objects.equals("rope")) {
                difficulty = 9.70;
                performance = 9.150;

            }

        }
        double assessment = difficulty + performance;

        double diffPoints = (20 - assessment);
        double diffPercent = diffPoints*100/20;

        System.out.printf("The team of %s get %.3f on %s.%n",country,assessment,objects);
        System.out.printf("%.2f%%",diffPercent);

    }
}
