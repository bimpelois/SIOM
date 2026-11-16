package data.repository;

import data.model.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Optional<Product> findById(int productId);

    List<Product> findAll();

    List<Product> findByName(String name);

    List<Product> findByPriceBetween(BigDecimal min, BigDecimal max);

    List<Product> findInStock();

    Product save(Product product);

    void deleteById(int productId);

    boolean updateStock(int productId, int newQuantity);
}
