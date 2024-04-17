package repository;

import model.Category;

import java.util.ArrayList;
import java.util.Objects;

public class CategoryRepository extends BaseRepository<Category> {


    protected static CategoryRepository categoryRepository = new CategoryRepository();

    public static CategoryRepository getInstance(){
        if(Objects.isNull(categoryRepository)){
            categoryRepository = new CategoryRepository();
        }
        return categoryRepository;
    }

    public static ArrayList<Category> getAllCategories(){
      return categoryRepository.data;
    }


}



