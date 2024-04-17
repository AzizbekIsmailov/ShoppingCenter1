package controller;

import model.Order;
import model.Product;
import utils.Messages;

import java.util.ArrayList;
import java.util.UUID;

import static controller.Main.*;
import static controller.Main.currentUser;

public class OrderController {
    static void createOrder(UUID categoryId){

        ArrayList<Product> products = productService.showCategoryProduct(categoryId);
        System.out.println(" Enter the number product --> ");
        int choice =scanNum.nextInt()-1;
        if(choice >= products.size() || choice <= -1){
            System.out.println(Messages.ERROR);
            return;
        }
        System.out.println("Enter the amount of products : ");
        int numberOfProducts = scanNum.nextInt();
        orderService.add(new Order(currentUser.getId(), products.get(choice).getId(), products.get(choice).getPrice(), numberOfProducts, "isGathering"));
        Product selectedProduct = products.get(choice);
        System.out.println("Order created for  : " + selectedProduct.getName());
        return;

    }

}
