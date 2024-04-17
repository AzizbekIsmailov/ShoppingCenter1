package service;

import model.Category;
import repository.CategoryRepository;

public class CategoryService extends BaseService<Category, CategoryRepository> {
    public CategoryService(CategoryRepository repository) {
        super(repository);
    }


}
