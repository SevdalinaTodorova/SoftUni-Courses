package FirstStepsInCoding.Excercise3;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Първи ред - дни за престой - цяло число в интервала [0...365]
        //•	Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
        //•	Трети ред - оценка - "positive"  или "negative"


        int days = Integer.parseInt(scanner.nextLine());
        String typePlace = scanner.nextLine();
        String rating = scanner.nextLine();

        double price = 0;



        switch (typePlace) {
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                price = 25;
                if (days < 10) {
                    price =price * 0.7;
                } else if (days >= 10 && days <= 15) {
                    price =price * 0.65;
                } else if (days > 15) {
                    price=price * 0.5;
                }

                break;
            case "president apartment":
                price = 35;
                if (days < 10) {
                    price=price * 0.9;
                } else if (days >= 10 && days <= 15) {
                    price=price * 0.85;
                } else if (days > 15) {
                    price=price * 0.8;
                }
                break;


        } switch (rating){
            case "positive":
                price=price*1.25;
                break;
            case "negative":
                price=price*0.9;
                break;
        }
        System.out.printf("%.2f",price*(days-1));

    }
}


