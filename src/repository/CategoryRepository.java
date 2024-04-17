package repository;

import model.Category;

import java.util.ArrayList;
import java.util.Objects;

public class CategoryRepository extends BaseRepository<Category> {


    private static final CategoryRepository categoryRepository = new CategoryRepository();

    public static CategoryRepository getInstance(){
        return categoryRepository;
    }

    public CategoryRepository() {
    }

    public  ArrayList<Category> getAllCategories(){
        return data;
    }


}



