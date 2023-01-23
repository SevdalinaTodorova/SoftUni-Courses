package FirstStepsInCoding.Excercise5;

import java.util.Scanner;

public class ExamPrep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxWrong = Integer.parseInt(scanner.nextLine());
        String inputTask = scanner.nextLine();
        int tasksAll = 0;
        int sumGrades = 0;
        int lowCount = 0;
        String lastProblem = "";

        while (!inputTask.equals("Enough")) {

            int grade = Integer.parseInt(scanner.nextLine());
            tasksAll++;
            sumGrades += grade;

            if (grade <= 4) {
                maxWrong--;
                lowCount++;

            }
            if (maxWrong == 0) {
                break;
            }

            lastProblem = inputTask;
            inputTask = scanner.nextLine();

        } if (maxWrong == 0) {

            System.out.printf("You need a break, %d poor grades.", lowCount);
        }
        else {

            double avgGrade = sumGrades * 1.0 / tasksAll;
            System.out.printf("Average score: %.2f%n", avgGrade);
            System.out.printf("Number of problems: %d%n", tasksAll);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }


}




