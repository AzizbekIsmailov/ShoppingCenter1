package controller;


import model.Category;
import model.User;
import service.CategoryService;
import service.OrderService;
import service.ProductService;
import service.UserService;

import java.util.Scanner;

public class Main {

    public static Scanner scanStr = new Scanner(System.in);
    public static Scanner scanNum = new Scanner(System.in);
    public static User currentUser = null;
    public static UserService userService = UserService.getInstance();
    public static ProductService productService = ProductService.getInstance();
    public static OrderService orderService = OrderService.getInstance();
    public static CategoryService categoryService = CategoryService.getInstance();
    public static void main(String[] args) {

        mainMenu();

    }

    private static void mainMenu() {
        while (true) {
            System.out.println(" 1 => | SignIn | \n 2 => | SignUp | \n 0 => | Exit | \n");
            String command = scanStr.nextLine();
            switch (command) {
                case "1" -> {
                    UserController.signIn();
                }
                case "2" -> {
                    UserController.signUp();
                }
                case "0" -> {
                    System.out.println(" BAY - BAY");
                    return;
                }
                default -> {
                    System.out.println("ERROR!!🤦‍♂️🤦‍♂️");
                }
            }
        }
    }


    public static void adminMenu(){
        while (true) {
            System.out.println(" 1 => | showProduct | \n 2 => | addProduct | \n 3 => | updateProduct | \n " +
                    "4 => | updateOrders | \n 5 => | showOrders | \n 6 => | blockUser | \n" +
                    " 7 => | unBlockUser | 8 => | showUsers | \n 9 => | addCategory | \n 10 => | showCategory | \n \n 0 => | Exit | \n");
            String command = scanStr.nextLine();
            switch (command) {
                case "1" -> {
                    ProductController.showProduct();
                }
                case "2" -> {
                    ProductController.addProduct();
                }
                case "3" -> {
                    ProductController.updateProduct();
                }
                case "4" -> {
                    OrderController.updateOrders();
                }
                case "5" -> {
                    OrderController.showOrders();
                }
                case "6" -> {
                    UserController.blockUser();
                }
                case "7" -> {
                    UserController.unBlockUser();
                }
                case "8" -> {
                    UserController.showUsers();
                }
                case "9" -> {
                    CategoryController.addCategory();
                }
                case "10" -> {
                    CategoryController.showCategory();
                }

                case "0" -> {
                    System.out.println(" BAY - BAY");
                    return;
                }
                default -> {
                    System.out.println("ERROR!!🤦‍♂️🤦‍♂️");
                }
            }
        }
    }


}

