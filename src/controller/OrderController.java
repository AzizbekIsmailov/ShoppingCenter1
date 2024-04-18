package controller;

import model.Category;
import model.Order;
import model.Product;
import utils.Messages;

import java.util.ArrayList;
import java.util.UUID;

import static controller.CategoryController.showCategory;
import static controller.Main.*;
import static controller.Main.currentUser;
import static controller.ProductController.showProduct;

public class OrderController {
    static void createOrder(){
        ArrayList<Category> categories = showCategory();
        System.out.println("Choose one -> | 0 -> Exit");
        int index = scanNum.nextInt() - 1;
        if(index == -1){
            return;
        }

        ArrayList<Product> products = showProduct(categories.get(index).getId());

        System.out.println(" Choose one get Order -> | 0 -> Exit ");
        int choice =scanNum.nextInt()-1;

        if(choice == -1){
            return;
        }

        if(choice >= products.size() || choice <= -1){
            System.out.println(Messages.ERROR);
            return;
        }
        System.out.println("Enter the amount of products : ");
        int numberOfProducts = scanNum.nextInt();
        orderService.add(new Order(currentUser.getId(), products.get(choice).getId(), products.get(choice).getPrice(), numberOfProducts));
        Product selectedProduct = products.get(choice);
        System.out.println("Order created for  : " + selectedProduct.getName());
        return;
    }



}
