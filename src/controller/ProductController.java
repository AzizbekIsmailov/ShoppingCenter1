package controller;

import model.Category;
import model.Product;

import java.util.ArrayList;
import java.util.UUID;

import static controller.CategoryController.showCategory;
import static controller.Main.*;

public class ProductController {

    public static void showProductByCategory(){
        ArrayList<Category> categories = showCategory();
        System.out.println("Choose one -> | 0 -> Exit");
        int index = scanNum.nextInt() - 1;

        showProduct(categories.get(index).getId());

    }


    public static ArrayList<Product> showProduct(UUID categoryId) {
        ArrayList<Product> products = productService.showCategoryProduct(categoryId);

        int i = 1;
        for (Product product : products) {
            System.out.println(i++ + ". " + product.getName() + product.getPrice());
        }

        return products;
    }

    public static void addProduct() {
        ArrayList<Category> categories = showCategory();

        System.out.print("Choose one -> | 0 -> Exit");
        int choice = scanNum.nextInt() - 1;
        if(choice == -1){
            return;
        }
        if(choice >= categories.size() || choice <= -1){
            System.out.println("ERROR!!!");
            return;
        }

        System.out.println(" Enter Name -> ");
        String name = scanStr.nextLine();

        System.out.println(" Enter Price -> ");
        Integer price = scanNum.nextInt();

        productService.add(new Product(name,price,categories.get(choice).getId()));
    }

    public static void updateProduct() {

    }
}
