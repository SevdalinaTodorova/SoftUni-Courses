package PreExam;

import java.util.Scanner;

public class GrandpaStavri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double litresAll = 0;
        double degreesAll = 0;

        for (int i = 1; i <= days; i++) {
            double litresDaily = Double.parseDouble(scanner.nextLine());
            double degreesDaily = Double.parseDouble(scanner.nextLine());
            litresAll += litresDaily;
            degreesAll += (litresDaily*degreesDaily);

        }
        double avgDegrees = degreesAll/litresAll;

        System.out.printf("Liter: %.2f%n",litresAll);
        System.out.printf("Degrees: %.2f%n", avgDegrees);

        if (avgDegrees<38){
            System.out.print("Not good, you should baking!");
        } else if (avgDegrees>=38 && avgDegrees<=42){
            System.out.print("Super!");
        } else {
            System.out.print("Dilution with distilled water!");
        }



    }

}
