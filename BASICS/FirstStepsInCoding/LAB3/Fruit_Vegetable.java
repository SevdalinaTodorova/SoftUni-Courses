package FirstStepsInCoding.LAB3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fruit_Vegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
        //•	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
        //•	Всички останали са "unknown"
        String fruitOrVeggie = scanner.nextLine();
        switch (fruitOrVeggie){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case  "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }

    }
}
