package controller;

import enumerators.UserRole;
import exception.DataNotFoundException;
import model.User;
import utils.Messages;

import java.util.ArrayList;
import java.util.SortedMap;

import static controller.Main.*;

public class UserController {
    public static void signIn() throws DataNotFoundException {
        System.out.println(" Enter Username -> ");
        String username = scanStr.nextLine();

        System.out.println(" Enter Password -> ");
        String password = scanStr.nextLine();

        currentUser = userService.signIn(username, password);

        if(currentUser == null){
            System.out.println("Something went wrong ! ");
            mainMenu();
        }
        if(currentUser.getRole().equals(UserRole.ADMIN)){
            adminMenu();
        } else {
            userMenu();
        }
    }



    public static void signUp() {
        System.out.println(" Enter Username => ");
        String username = scanStr.nextLine();

        System.out.println(" Enter Password => ");
        String password = scanStr.nextLine();

        System.out.println(" Enter Balance => ");
        Integer balance = scanNum.nextInt();


        userService.add(new User(username, password, balance, UserRole.USER));
//            System.out.println(Messages.SUCCESS);
//
//            System.out.println("this username already exits!!!");


    }

    public static ArrayList<User> showUsers() {
        ArrayList<User> users = userService.getAll();
        int i = 1;
        for (User user : users) {
            System.out.println(i++ + ". " + user.getUsername());
        }
        return users;
    }

    public static void blockUser() {
        ArrayList<User> users = userService.getNoBlockedUsers();

        int i = 0;
        for (User user : users) {
            System.out.println(++i + " : " + user.getUsername());
        }


        System.out.print("Enter the number :   And 0 => Exit");

        int choice = scanNum.nextInt() - 1;
        if(choice == -1){
            return;
        }
        if(choice >= users.size() || choice <= -1){
            System.out.println("ERROR!!!");
            return;
        }
        userService.blockOrUnBlockUser(users.get(choice).getId(), false);
        System.out.println("USER blocked!!!");
    }

    public static void unBlockUser() {
        ArrayList<User> users = userService.getBlockedUsers();
        int i = 0;
        for (User user : users) {
            System.out.println(++i + " : " + user.getUsername());
        }


        System.out.print("Enter the number :   And 0 => Exit");

        int choice = scanNum.nextInt() - 1;
        if(choice == -1){
            return;
        }
        if(choice >= users.size() || choice <= -1){
            System.out.println("ERROR!!!");
            return;
        }
        userService.blockOrUnBlockUser(users.get(choice).getId(), true);
        System.out.println("USER blocked!!!");

    }
}
