package poc.mongodb.ecommerce.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Product")
@Data
public class Product {

    @Id
    private String id;

    private Integer number;

    private String description;

    private Integer quantity;


}
