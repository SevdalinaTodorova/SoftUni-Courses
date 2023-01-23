package EXCERCISES.N2;

import java.util.Scanner;

public class WaterFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());
        int sumLitresInside = 0;

        for (int i = 0; i < n; i++) {
            int currentLitres = Integer.parseInt(scanner.nextLine());

            if (currentLitres > (capacity - sumLitresInside)) {
                System.out.println("Insufficient capacity!");
                currentLitres = 0;
            }
            sumLitresInside += currentLitres;

        }
        System.out.println(sumLitresInside);


    }

}

