package FirstStepsInCoding.LAB1;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Входни данни
        double inches = Double.parseDouble(scanner.nextLine());

        // Изчисления
        double centimeters = inches * 2.54;

        //Изходни данни
        System.out.println(centimeters);



    }
}
