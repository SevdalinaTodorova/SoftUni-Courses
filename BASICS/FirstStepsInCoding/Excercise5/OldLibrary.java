package FirstStepsInCoding.Excercise5;

import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        int sumCheckedBooks = 0;
        boolean isFound = false;
        String input = scanner.nextLine();

        while (!input.equals("No More Books")) {

            if (input.equals(bookName)) {
                isFound = true;
                break;

            }
            sumCheckedBooks++;
            input = scanner.nextLine();

        }
        if (!isFound) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", sumCheckedBooks);

        } else {
            System.out.printf("You checked %d books and found it.", sumCheckedBooks);
        }


    }


}
