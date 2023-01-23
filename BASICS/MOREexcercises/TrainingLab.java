package MOREexcercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Учебна зала има правоъгълен размер w на h метра
        // eдно работно място заема 70 на 120 cm
        // Коридорът е широк поне 100 cm. Изчислено е, че заради входната врата
        // (която е с отвор 160 cm) се губи точно 1 работно място,
        // а заради катедрата (която е с размер 160 на 120 cm) се губят точно 2 работни места.

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double w_cm = w*100;
        double h_cm = h*100;
        double workplace = 70*120.0; // площ на едно раб.място
        double free_h = h_cm -100 ; // ширина  без коридора

        int rows = (int)Math.floor(free_h/70);
        int columns = (int)Math.floor(w_cm/120);

        int workstations = rows*columns -3;
        System.out.printf("%d", workstations);















    }
}
