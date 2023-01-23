package EXCERCISES.N2;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacityElevator = Integer.parseInt(scanner.nextLine());

        int courses = (int) Math.ceil(people*1.0/capacityElevator);

        System.out.println(courses);




    }
}
