package controller;

import model.Category;
import model.Product;

import java.util.ArrayList;
import java.util.UUID;

import static controller.Main.*;

public class ProductController {

    public static ArrayList<Product> showProduct() {
        ArrayList<Product> products = productService.getAll();

        int i = 0;
        for (Product product : products) {
            System.out.println(++i + " : " + product.getName() + product.getPrice());
        }

        return products;
    }

    public static void addProduct() {
        ArrayList<Category> categories = categoryService.getAll();

        int i = 0;
        for (Category category : categories) {
            System.out.println(++i + " : " + category.getName());
        }


        System.out.print("Enter the number :   And 0 => Exit");
        int choice = scanNum.nextInt() - 1;
        if(choice == -1){
            return;
        }
        if(choice >= categories.size() || choice <= -1){
            System.out.println("ERROR!!!");
            return;
        }

        System.out.println(" Enter Name => ");
        String name = scanStr.nextLine();

        System.out.println(" Enter Price => ");
        Integer price = scanNum.nextInt();

        productService.add(new Product(name,price,categories.get(choice).getId()));
    }

    public static void updateProduct() {
        ArrayList<Product> products = showProduct();



    }
}
