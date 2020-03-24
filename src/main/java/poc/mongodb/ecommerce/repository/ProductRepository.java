package poc.mongodb.ecommerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import poc.mongodb.ecommerce.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
