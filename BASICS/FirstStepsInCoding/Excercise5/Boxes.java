package FirstStepsInCoding.Excercise5;

import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int volume = l * h * w;
        int allBoxes = 0;

        while (volume >= allBoxes) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                System.out.printf("%d Cubic meters left.", volume - allBoxes);
                break;
            }
            int boxes = Integer.parseInt(input);
            allBoxes += boxes;

        }
        if (allBoxes > volume) {
            System.out.printf("No more free space! You need %d Cubic meters more.", allBoxes - volume);
        }


    }


}


