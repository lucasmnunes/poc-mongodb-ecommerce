package poc.mongodb.ecommerce.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import poc.mongodb.ecommerce.model.Product;
import poc.mongodb.ecommerce.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository repository;

    ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(String id) {
        return repository.findById(id).get();
    }

    public Product save(Product product) {
        return repository.save(product);
    }

}
