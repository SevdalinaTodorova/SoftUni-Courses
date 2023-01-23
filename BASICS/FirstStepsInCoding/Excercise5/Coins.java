package FirstStepsInCoding.Excercise5;

import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double changeLv = Double.parseDouble(scanner.nextLine());
        double changeSt = changeLv * 100;
        int coins = 0;

        while (changeLv > 0) {

            if (changeSt >= 200) {
                changeSt = changeSt - 200;
                coins++;
                continue;
            } else if (changeSt >= 100) {
                changeSt = changeSt - 100;
                coins++;
                continue;
            } else if (changeSt >= 50) {
                changeSt = changeSt - 50;
                coins++;
                continue;
            } else if (changeSt >= 20) {
                changeSt = changeSt - 20;
                coins++;
                continue;
            } else if (changeSt >= 10) {
                changeSt = changeSt - 10;
                coins++;
                continue;
            } else if (changeSt >= 5) {
                changeSt = changeSt - 5;
                coins++;
                continue;
            }else if (changeSt>=2){
                changeSt=changeSt-2;
                coins++;
                continue;
            } else if (changeSt>=1){
                coins++;


            } System.out.println(coins);
            break;


        }



    }


}
