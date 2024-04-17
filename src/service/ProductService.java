package service;

import model.Product;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.UUID;

public class ProductService extends BaseService<Product, ProductRepository> {

    public static final ProductService productService = new ProductService();
    public static ProductService getInstance(){
        return productService;
    }
    public ProductService() {
        super(ProductRepository.getInstance());
    }

    public ArrayList<Product> showCategoryProduct(UUID id){
        return repository.showCategoryProduct(id);
    }

    @Override
    public boolean check(Product product) {
        return false;
    }
}
