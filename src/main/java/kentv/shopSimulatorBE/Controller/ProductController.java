package kentv.shopSimulatorBE.Controller;

import kentv.shopSimulatorBE.Model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProduct() {
        List<Product> productList = new ArrayList<>();

        Product chips = new Product("Lays Potato Chips", 3, "Snack");
        Product chocolate = new Product("Chocolate", 5, "Snack");
        Product cheese = new Product("Shredded Cheese", 6, "Drink");
        Product yogurt = new Product("Yogurt", 4, "Dairy");
        Product butter = new Product("Butter", 5, "Meat");

        productList.add(chips);
        productList.add(chocolate);
        productList.add(cheese);
        productList.add(yogurt);
        productList.add(butter);

        return productList;
    }

}
