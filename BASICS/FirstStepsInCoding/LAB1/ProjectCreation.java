package FirstStepsInCoding.LAB1;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане на входни данни
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        // Изчисления на данни
        int neededtime = projects * 3;
        // Изходни данни
        System.out.printf("The architect %s will need %d hours " +
                "to complete %d project/s.", name, neededtime, projects);


    }
}
