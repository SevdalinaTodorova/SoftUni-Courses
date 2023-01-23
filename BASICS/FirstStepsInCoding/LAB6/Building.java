package FirstStepsInCoding.LAB6;

import java.util.Scanner;

public class Building {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        String type = "";

        for (int i = floors; i >= 1; i--) {

            for (int j = 0; j < rooms; j++) {
                if (i==floors){
                    type = "L";
                }
                else if (i%2==0){
                    type = "O";
                }
                else {
                    type = "A";
                }

                System.out.printf("%s%d%d ",type,i,j);
            }
            System.out.println("");


        }


    }


}



