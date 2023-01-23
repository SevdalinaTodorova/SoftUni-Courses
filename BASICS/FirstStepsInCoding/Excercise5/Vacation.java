package FirstStepsInCoding.Excercise5;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excPrice = Double.parseDouble(scanner.nextLine());
        double sum = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int daysSpending = 0;

        while (daysSpending<5 && sum<excPrice) {
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            days++;

            if (action.equals("save")){
                sum=sum+amount;
                daysSpending=0;

            } else if (action.equals("spend")) {
                sum=sum-amount;
                daysSpending++;

                if (sum<0){
                    sum=0;
                }

            }

        }if (daysSpending==5){
            System.out.println("You can't save the money.");
            System.out.printf("%d",days);
        } if (sum>=excPrice){
            System.out.printf("You saved the money for %d days.",days);
        }



    }

}

