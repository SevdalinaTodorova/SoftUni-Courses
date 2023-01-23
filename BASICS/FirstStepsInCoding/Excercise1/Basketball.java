package FirstStepsInCoding.Excercise1;

import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fee = Integer.parseInt(scanner.nextLine());
        double sneakers = fee - fee * 0.4;
        double outfit = sneakers - sneakers * 0.2;
        double ball = 0.25 * outfit;
        double accessoires = 0.2 * ball;
        double sum = fee + sneakers + outfit + ball + accessoires;
        System.out.println(sum);


    }
}
