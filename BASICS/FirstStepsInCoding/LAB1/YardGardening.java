package FirstStepsInCoding.LAB1;

import java.util.Scanner;

public class YardGardening {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Цената на един кв. м. е 7.61 лв със ДДС // 18% отстъпка от крайната цена.
        // "The final price is: {крайна цена на услугата} lv."
        // "The discount is: {отстъпка} lv."

        double area = Double.parseDouble(scanner.nextLine());
        double pricebeforediscount = area * 7.61;
        double discount = pricebeforediscount * 0.18;
        double finalprice = pricebeforediscount - discount;

        System.out.printf("The final price is: %f lv.", finalprice);
        System.out.printf("The discount is: %f lv.", discount);


    }
}
