package service;

import model.Category;
import repository.CategoryRepository;

import java.util.ArrayList;

public class CategoryService extends BaseService<Category, CategoryRepository> {
    public static final CategoryService categoryService = new CategoryService();
    public static CategoryService getInstance() {
        return categoryService;
    }
    public CategoryService() {
        super(CategoryRepository.getInstance());
    }

    public  ArrayList<Category> getAllCategories(){
        return repository.getAllCategories();
    }

    @Override
    public boolean check(Category category) {
        return false;
    }
}
