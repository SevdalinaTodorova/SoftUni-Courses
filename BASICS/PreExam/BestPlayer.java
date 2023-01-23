package PreExam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String name = "";
        int maxGoals = Integer.MIN_VALUE;
        boolean isBestPlayer = false;

        while (!input.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals == maxGoals) {
                input = scanner.nextLine();
                continue;
            }
            name = input;

            if (goals > maxGoals) {
                maxGoals = goals;

                if (maxGoals >= 10) {
                    isBestPlayer = true;
                    break;
                }

            }
            input = scanner.nextLine();

        }
        System.out.printf("%s is the best player!%n", name);

        if (maxGoals < 3) {
            System.out.printf("He has scored %d goals.", maxGoals);
        } else {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        }


    }

}

