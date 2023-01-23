package FirstStepsInCoding.LAB5;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int years = 1;
        double sumGrade = 0;
        int countLowGrades = 0;

        while (years <= 12) {

            if (countLowGrades > 1) {
                break;
            }

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                countLowGrades++;
                continue;

            }
            sumGrade = sumGrade + grade;
            years++;

        }
        if (countLowGrades > 1) {
            System.out.printf("%s has been excluded at %d grade", name, years);

        } else {
            double avgGrade = sumGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);

        }


    }


}



