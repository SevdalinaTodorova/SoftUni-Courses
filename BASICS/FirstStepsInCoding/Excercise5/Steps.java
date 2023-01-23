package FirstStepsInCoding.Excercise5;

import java.util.Scanner;

public class Steps {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int goalSteps = 10000;
        int totalSteps = 0;


        while (totalSteps < goalSteps) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                int lastSteps = Integer.parseInt(scanner.nextLine());
                totalSteps += lastSteps;
                break;
            }
            int steps = Integer.parseInt(input);
            totalSteps += steps;


        }
        if (totalSteps < goalSteps) {
            System.out.printf("%d more steps to reach goal.", (goalSteps - totalSteps));

        } else {
            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%d steps over the goal!", totalSteps - goalSteps);

        }


    }


}







