package PreExam;

import java.util.Scanner;

public class PCstore {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        double priceProcUSD = Double.parseDouble(scanner.nextLine());
        double priceCardUSD = Double.parseDouble(scanner.nextLine());
        double priceRAMUSD = Double.parseDouble(scanner.nextLine());
        int countRAM = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double procBGN = priceProcUSD*1.57;
        double cardBGN = priceCardUSD*1.57;
        double ramBGN = priceRAMUSD*1.57;

        double totalSum = procBGN + cardBGN + (countRAM*ramBGN);
        double discountSum = (procBGN + cardBGN) * discount;

        System.out.printf("Money needed - %.2f leva.",(totalSum-discountSum));







    }

}
