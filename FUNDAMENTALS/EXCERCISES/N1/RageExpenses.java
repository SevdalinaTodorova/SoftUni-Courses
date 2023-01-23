package EXCERCISES.N1;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames =Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardsPrice = Double.parseDouble(scanner.nextLine());
        double screenPrice = Double.parseDouble(scanner.nextLine());

        int brokenHeadset = lostGames/2;
        int brokenMouse = lostGames/3;
        int brokenScreen = lostGames/12;
        int brokenKeyboard = lostGames/6;

        double totalSum = headsetPrice*brokenHeadset + mousePrice*brokenMouse + screenPrice*brokenScreen+
                + keyboardsPrice*brokenKeyboard ;

        System.out.printf("Rage expenses: %.2f lv.",totalSum);






    }
}
