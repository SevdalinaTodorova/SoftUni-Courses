package FirstStepsInCoding.Excercise6;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jouryCount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double presentationGrades = 0;
        double allGrades = 0;
        int countPresentation = 0;


        while (!input.equals("Finish")) {
            for (int i = 1; i <= jouryCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                presentationGrades += grade;
                allGrades += grade;
                countPresentation++;

            }
            System.out.printf("%s - %.2f.%n", input, (presentationGrades / jouryCount));
            presentationGrades = 0;
            input = scanner.nextLine();

        }
        if (input.equals("Finish")) {
            double avgFinalGrade = allGrades / countPresentation;
            System.out.printf("Student's final assessment is %.2f.", avgFinalGrade);
        }


    }
}
