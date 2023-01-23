package FirstStepsInCoding.Excercise1;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volumeInCm3 = lenght * width * height;
        double volumeInM3 = volumeInCm3 * 0.001;
        double volumeAqua = volumeInM3 - volumeInM3*percent/100;
        System.out.println(volumeAqua);



    }
}
