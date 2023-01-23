package EXCERCISES.N1;

import java.util.Scanner;

public class PadawanEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double priceLightsaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double neededLightsabers = Math.ceil(studentsCount * 1.1);
        int beltsToBePaid = studentsCount - studentsCount / 6;
        double neededSum = neededLightsabers * priceLightsaber + studentsCount * priceRobe + beltsToBePaid * priceBelt;

        if (sum >= neededSum) {
            System.out.printf("The money is enough - it would cost %.2flv.", neededSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", neededSum - sum);

        }


    }
}
