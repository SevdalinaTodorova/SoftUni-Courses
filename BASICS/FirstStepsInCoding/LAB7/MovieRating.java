package FirstStepsInCoding.LAB7;

import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double maxRating = 0;
        String nameMax = "";
        double minRating = 10;
        String nameMin = "";
        double allRatings = 0;

        for (int i = 1; i <= num; i++) {

            String movie = scanner.nextLine();
            double currentRating = Double.parseDouble(scanner.nextLine());
            allRatings+=currentRating;

            if (currentRating > maxRating) {
                maxRating = currentRating;
                nameMax=movie;

            }
            if (currentRating < minRating) {
                minRating = currentRating;
                nameMin = movie;
            }


        }
        System.out.printf("%s is with highest rating: %.1f%n",nameMax,maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n",nameMin,minRating);
        System.out.printf("Average rating: %.1f",allRatings/num);



    }
}
