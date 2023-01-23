package FirstStepsInCoding.Excercise1;

import java.util.Scanner;

public class RadianstoDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //   градус = радиан * 180 / π.
        //Числото π в Java програми е достъпно чрез Math.PI.
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;
        // изходни данни
        System.out.println(degrees);



    }
}
