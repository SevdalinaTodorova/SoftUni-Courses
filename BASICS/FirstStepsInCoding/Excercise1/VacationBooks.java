package FirstStepsInCoding.Excercise1;

import java.util.Scanner;

public class VacationBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1.	Брой страници в текущата книга – цяло число в интервала [1…1000]
        //2.	Страници, които прочита за 1 час – цяло число в интервала [1…1000]
        //3.	Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]

        int BookPages = Integer.parseInt(scanner.nextLine());
        int PagesHourly = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int hoursDaily = (BookPages/days)/PagesHourly;
        System.out.println(hoursDaily);
    }
}
