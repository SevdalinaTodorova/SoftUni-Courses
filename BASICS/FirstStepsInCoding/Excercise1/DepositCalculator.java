package FirstStepsInCoding.Excercise1;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double depositamount = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        //изчисления
        double sum = depositamount + months * ((depositamount * percent / 100.0) / 12);
        // изходни данни
        System.out.println(sum);


    }


}
