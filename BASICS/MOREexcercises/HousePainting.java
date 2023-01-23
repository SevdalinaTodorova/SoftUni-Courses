package MOREexcercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //1.	x – височината на къщата – реално число в интервала [2...100]
        //2.	y – дължината на страничната стена – реално число в интервала [2...100]
        //3.	h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wallsArea = (2 * x + 2 * y) * x - 2 * (1.5 * 1.5) - 1.2 * 2;

        double roofArea = 2 * (x * h / 2) + 2 * (x * y);

        double paintWalls = wallsArea / 3.4;
        double paintRoof = roofArea / 4.3;

        System.out.printf("%.2f", paintWalls);
        System.out.println("");
        System.out.printf("%.2f", paintRoof);


    }
}
