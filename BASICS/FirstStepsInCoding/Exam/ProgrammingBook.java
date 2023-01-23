package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double pricePage = Double.parseDouble(scanner.nextLine());
        double priceCover = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());
        double sumDesigner = Double.parseDouble(scanner.nextLine());
        double percentDueTeam = Double.parseDouble(scanner.nextLine());

        double sumPublishing = (899 * pricePage + 2 * priceCover);
        double sumPublishingAfterDisc = sumPublishing - (sumPublishing * percentDiscount) / 100;
        double sumPlusDesign = sumPublishingAfterDisc + sumDesigner;
        double sumFinal = sumPlusDesign - (sumPlusDesign * percentDueTeam) / 100;

        System.out.printf("Avtonom should pay %.2f BGN.", sumFinal);


    }
}
