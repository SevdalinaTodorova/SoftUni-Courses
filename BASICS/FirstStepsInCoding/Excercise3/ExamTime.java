package FirstStepsInCoding.Excercise3;

import java.util.Scanner;

public class ExamTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivingHour = Integer.parseInt(scanner.nextLine());
        int arrivingMin = Integer.parseInt(scanner.nextLine());

        int totalMinExam = examHour * 60 + examMin;
        int totalMinArr = arrivingHour * 60 + arrivingMin;
        int diff = totalMinExam - totalMinArr;

        if (diff == 0) {
            System.out.println("On time");
        } else if (diff > 0 && diff <= 30) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", Math.abs(diff));
        } else if (diff < 0) {
            diff = Math.abs(diff);
            System.out.println("Late");
            if (diff >= 60) {
                examHour = diff / 60;
                examMin = diff % 60;
                System.out.printf("%d:%02d hours after the start", examHour, examMin);
            } else {
                System.out.printf("%d minutes after the start", Math.abs(diff));
            }

        } else {
            System.out.println("Early");

            if (diff >= 60) {
                examHour = diff / 60;
                examMin = diff % 60;
                System.out.printf("%d:%02d hours before the start", examHour, examMin);

            } else {
                System.out.printf("%d minutes before the start", Math.abs(diff));

            }

        }


    }


}


