package controller;


import enumerators.UserRole;
import exception.DataNotFoundException;
import model.Category;
import model.User;
import service.CategoryService;
import service.OrderService;
import service.ProductService;
import service.UserService;
import utils.Messages;

import java.util.Scanner;

import static controller.OrderController.createOrder;
import static controller.UserController.signIn;
import static controller.UserController.signUp;

public class Main {

    public static Scanner scanStr = new Scanner(System.in);
    public static Scanner scanNum = new Scanner(System.in);
    public static User currentUser = null;
    public static UserService userService = UserService.getInstance();
    public static ProductService productService = ProductService.getInstance();
    public static OrderService orderService = OrderService.getInstance();
    public static CategoryService categoryService = CategoryService.getInstance();
    public static void main(String[] args) throws DataNotFoundException {
        userService.add(new User("123","123",10000, UserRole.ADMIN));
        userService.add(new User("aziz", "aziz", 1500000, UserRole.ADMIN));
        userService.add(new User("qwe","qwe",150000,UserRole.USER));
        userService.add(new User("asd","asd",200000,UserRole.USER));

        addDefault();
        mainMenu();

    }

    static void mainMenu() throws DataNotFoundException {
        while (true) {
            System.out.println(" 1 => | SignIn | \n 2 => | SignUp | \n 0 => | Exit | \n");
            String command = scanStr.nextLine();
            switch (command) {
                case "1" -> {
                    signIn();
                }
                case "2" -> {
                    signUp();
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
                    ProductController.showProductByCategory();
                }
                case "2" -> {
                    ProductController.addProduct();
                }
                case "3" -> {
                    ProductController.updateProduct();
                }
                case "4" -> {
//                   OrderController.updateOrders();
                }
                case "5" -> {
//                    OrderController.showOrders();
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
    public static void userMenu(){
        while (true){
            System.out.println("1 => Create order  2 => Show Orders 0 => Exit");
            String command = scanStr.nextLine();
            switch (command){
                case "1" ->{
                   createOrder();
                }
                case "2"->{

                }
                case "0"->{
                    System.out.println("Bye bye !!!");
                    return;
                }
                default -> {
                    System.out.println(Messages.ERROR);
                }

            }

        }
    }

    private static void addDefault() {


        categoryService.add(new Category("Clothes"));
        categoryService.add(new Category("Shoes"));
        categoryService.add(new Category("Fruits"));

    }



}

