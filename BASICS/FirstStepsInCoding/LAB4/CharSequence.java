package FirstStepsInCoding.LAB4;

import java.util.Scanner;

public class CharSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();


        for (int i =0; i < text.length(); i++ ) {
            char letter = text.charAt(i);
            System.out.println(letter);
        }


    }
}
