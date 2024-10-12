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

        Product chips = new Product("Potato Chips", 3, "Snack",
                "https://freshcart.codescandy.com/assets/images/products/product-img-4.jpg");
        Product chocolate = new Product("Chocolate", 5, "Snack",
                "https://freshcart.codescandy.com/assets/images/products/product-img-9.jpg");
        Product cheese = new Product("Cheese", 6, "Drink",
                "https://freshcart.codescandy.com/assets/images/products/product-img-7.jpg");
        Product yogurt = new Product("Yogurt", 4, "Dairy",
                "https://freshcart.codescandy.com/assets/images/products/product-img-6.jpg");
        Product butter = new Product("Butter", 5, "Meat",
                "https://freshcart.codescandy.com/assets/images/products/product-img-10.jpg");

        productList.add(chips);
        productList.add(chocolate);
        productList.add(cheese);
        productList.add(yogurt);
        productList.add(butter);

        return productList;
    }

}
