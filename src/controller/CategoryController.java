package controller;

import model.Category;

import java.util.ArrayList;

import static controller.Main.categoryService;
import static controller.Main.scanStr;

public class CategoryController {

    public static void addCategory(){
        System.out.println("Enter category name -> ");
        String name = scanStr.nextLine();

        categoryService.add(new Category(name));
    }

    public static ArrayList<Category> showCategory(){
        ArrayList<Category> categories = categoryService.getAllCategories();

        int i = 1;
        for (Category category : categories) {
            System.out.println(i++ + ". " + category.getName());
        }
        return categories;
    }


}


