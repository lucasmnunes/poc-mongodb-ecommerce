package poc.mongodb.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poc.mongodb.ecommerce.repository.ProductRepository;
import poc.mongodb.ecommerce.model.Product;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    ResponseEntity<List<Product>> findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<Product> findById(@PathVariable("id") String id) {
        return new ResponseEntity<>(repository.findById(id).get(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Product> save(@RequestBody Product product) {
        return new ResponseEntity<>(repository.save(product), HttpStatus.CREATED);
    }

}
