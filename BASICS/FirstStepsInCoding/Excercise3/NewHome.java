package FirstStepsInCoding.Excercise3;

import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;


        if (flower.equals("Roses")) {
            totalPrice = count*5;
            if (count > 80) {
                totalPrice = totalPrice * 0.9;
            }
        } else if (flower.equals("Dahlias")) {
            totalPrice=(count * 3.8);
            if (count > 90) {
                totalPrice = totalPrice * 0.85;
            }

        } else if (flower.equals("Tulips")) {
            totalPrice=(count * 2.8);
            if (count > 80) {
                totalPrice = totalPrice * 0.85;
            }

        } else if (flower.equals("Narcissus")) {
            totalPrice=(count*3);
            if (count<120){
                totalPrice=totalPrice*1.15;
            }

        } else if (flower.equals("Gladiolus")) {
            totalPrice=(count*2.5);
            if (count<80){
                totalPrice=totalPrice*1.2;
            }

        }if (budget>=totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s " +
                    "and %.2f leva left.",count,flower,budget-totalPrice);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",totalPrice-budget);
        }


    }
}
