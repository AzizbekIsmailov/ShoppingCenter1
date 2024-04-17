package repository;

import model.Order;
import model.Product;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class ProductRepository extends BaseRepository<Product> {

    private static final ProductRepository productRepository = new ProductRepository();

    public static ProductRepository getInstance(){return productRepository;}

    public ProductRepository() {
    }

    public ArrayList<Product> showCategoryProduct(UUID id){
        ArrayList<Product> products = new ArrayList<>();
        for (Product product : data) {
            if(Objects.equals(product.getCategoryId(), id)){
                products.add(product);
            }
        }
        return products;
    }
}
