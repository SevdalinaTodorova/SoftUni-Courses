package PreExam;

import java.util.Scanner;

public class FootballKit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tShirtPrice = Double.parseDouble(scanner.nextLine());
        double winningSum = Double.parseDouble(scanner.nextLine());

        double shortsPrice = tShirtPrice*0.75;
        double socksPrice = shortsPrice*0.2;
        double boots = (tShirtPrice+shortsPrice)*2;
        double totalSum = (tShirtPrice+shortsPrice+socksPrice+boots)*0.85;

        if (totalSum>= winningSum){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.",totalSum);
        }
        else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.",winningSum-totalSum);

        }







    }

}
