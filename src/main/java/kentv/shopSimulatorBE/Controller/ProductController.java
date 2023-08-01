package kentv.shopSimulatorBE.Controller;

import kentv.shopSimulatorBE.Model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProduct() {
        List<Product> productList = new ArrayList<>();

        Product GPU = new Product("GPU", 349.99);
        Product car = new Product("Car", 5999.99);
        Product controller = new Product("Controller", 69.99);

        productList.add(GPU);
        productList.add(car);
        productList.add(controller);

        return productList;
    }

}
