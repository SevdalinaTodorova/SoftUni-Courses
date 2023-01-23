package FirstStepsInCoding.Excercise4;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nCheckedTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int sumFines = 0;

        for (int i = 1; i <= nCheckedTabs; i++) {
            String website = scanner.nextLine();
            if (website.equals("Facebook")) {
                sumFines += 150;
            } else if (website.equals("Instagram")) {
                sumFines += 100;
            } else if (website.equals("Reddit")) {
                sumFines += 50;

            }
        }if (salary>sumFines){
            System.out.printf("%d",(salary-sumFines));
        }else{
            System.out.println("You have lost your salary.");
        }
    }
}
