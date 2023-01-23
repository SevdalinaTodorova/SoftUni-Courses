package FirstStepsInCoding.Excercise1;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //фиксиран курс между долар и лев: 1 USD = 1.79549 BGN
                double USD = Double.parseDouble(scanner.nextLine());
        double BGN = USD * 1.79549;
        System.out.printf("%f", BGN);

    }
}
