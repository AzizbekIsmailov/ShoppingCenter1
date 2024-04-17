package controller;

import static controller.Main.scanStr;

public class UserController {
    public static void signIn() {
    }

    public static void signUp() {
        System.out.println(" Enter Username => ");
        String username = scanStr.nextLine();

        System.out.println(" Enter Password => ");
        String password = scanStr.nextLine();


    }
}
