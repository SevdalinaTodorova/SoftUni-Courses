package FirstStepsInCoding.Excercise3;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceApp = 0;
        double priceStu = 0;

        switch (month) {
            case "May":
            case "October":
                priceStu = 50;
                if (nights > 7 && nights<=14) {
                    priceStu = priceStu * 0.95;
                } else if (nights > 14) {
                    priceStu = priceStu * 0.7;
                }
                priceApp = 65;
                break;
            case "June":
            case "September":
                priceStu = 75.20;
                priceApp = 68.70;
                if (nights > 14) {
                    priceStu = priceStu * 0.8;
                }
                break;

            case "July":
            case "August":
                priceStu = 76;
                priceApp = 77;
                break;
        }
        if (nights > 14) {
            priceApp = priceApp * 0.9;
        }
        System.out.printf("Apartment: %.2f lv.%n", nights * priceApp);
        System.out.printf("Studio: %.2f lv.%n", nights * priceStu);


    }
}
