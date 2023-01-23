package EXCERCISES.N1;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String passwordtry = scanner.nextLine();
        String password = "";
        int invalidTries = 0;

        for (int position = userName.length() - 1; position >= 0; position--) {
            char currentSymbol = userName.charAt(position);
            password = password + currentSymbol;

        }
        while (!passwordtry.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            invalidTries++;
            if (invalidTries==3){
                System.out.printf("User %s blocked!",userName);
                break;
            }
            passwordtry = scanner.nextLine();
        }
        if (passwordtry.equals(password)){
            System.out.printf("User %s logged in.", userName);
        }



    }

}
