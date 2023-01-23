package FirstStepsInCoding.LAB2;

import java.util.Scanner;

public class AreaFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double area = 0.0;

        if (figure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;


        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;


        } else if (figure.equals("triangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideH = Double.parseDouble(scanner.nextLine());
            area = (sideA * sideH) / 2;


        } else if (figure.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB;

        }
        System.out.printf("%.3f", area);
    }
}
