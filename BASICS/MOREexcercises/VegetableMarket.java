package MOREexcercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Първи ред –Цена за килограм зеленчуци –реално число[ 0.00…1000.00]
//•Втори ред –Цена за килограм плодове –реално число[ 0.00…1000.00]
//•Трети ред –Общо килограми на зеленчуците –цяло число[ 0…1000]
//•Четвърти ред –Общо килограми на плодовете –цяло число[ 0…1000]
        // евро е 1,94 лева

        double veg$ = Double.parseDouble(scanner.nextLine());
        double fruits$ = Double.parseDouble(scanner.nextLine());
        int vegKG = Integer.parseInt(scanner.nextLine());
        int fruitsKG = Integer.parseInt(scanner.nextLine());
        double totalBGN = veg$ * vegKG + fruits$ * fruitsKG;

        System.out.printf("%.2f", totalBGN/1.94);

    }
}
