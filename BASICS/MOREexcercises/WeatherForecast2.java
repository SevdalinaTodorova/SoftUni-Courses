package MOREexcercises;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());
        String weather = "0";

        if (degrees >= 5.00) {
            weather = "Cold";

        }
        if (degrees >= 12.00) {
            weather = "Cool";

        }
        if (degrees >= 15.00) {
            weather = "Mild";

        }
        if (degrees >= 20.1) {
            weather = "Warm";

        }
        if (degrees >= 26.00 && degrees <= 35.00) {
            weather = "Hot";


        } else if (degrees < 5.00 || degrees > 35.00) {
            weather = "unknown";
        }
        System.out.println(weather);
    }

}



