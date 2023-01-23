package FirstStepsInCoding.Excercise6;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            int sumEven = 0;
            int sumOdd = 0;
            int currentNum = i;

            for (int j = 6; j >= 1; j--) { // позиция на цифрите
                int digit = currentNum % 10; // взимаме последната цифра от числото
                if (j%2==0){ // ако позицията е четна, се добавя към четната сума
                    sumEven+= digit;
                }else {
                    sumOdd+=digit;
                } currentNum =currentNum/10; // отпада последната цифра от числото


            } if (sumOdd==sumEven){
                System.out.printf("%d ", i);
            }

        }


    }

}
