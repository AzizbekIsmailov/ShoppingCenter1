package repository;

import model.Category;

import java.util.ArrayList;
import java.util.Objects;

public class CategoryRepository extends BaseRepository<Category> {


    private static CategoryRepository categoryRepository = new CategoryRepository();

    public static CategoryRepository getInstance(){
        if(Objects.isNull(categoryRepository)){
            categoryRepository = new CategoryRepository();
        }
        return categoryRepository;
    }

    public ArrayList<Category> getAllCategories(){
      return categoryRepository.data;
    }


}



