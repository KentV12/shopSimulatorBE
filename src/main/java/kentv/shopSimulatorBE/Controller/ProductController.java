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

        // placeholder items - representing retrieval of inventory in database
//        Product chips = new Product("Lays Potato Chips", 3, "Snack",
//                "https://karantenabc.hu/img/44906/596238/440x440,r/596238.jpg?time=1690947737");
        Product chips = new Product("Lays Potato Chips", 3, "Snack",
                "https://freshcart.codescandy.com/assets/images/products/product-img-4.jpg");
        Product chocolate = new Product("Chocolate", 5, "Snack",
                "https://karantenabc.hu/img/44906/596238/440x440,r/596238.jpg?time=1690947737");
        Product cheese = new Product("Shredded Cheese", 6, "Drink",
                "https://karantenabc.hu/img/44906/596238/440x440,r/596238.jpg?time=1690947737");
        Product yogurt = new Product("Yogurt", 4, "Dairy",
                "https://karantenabc.hu/img/44906/596238/440x440,r/596238.jpg?time=1690947737");
        Product butter = new Product("Butter", 5, "Meat",
                "https://karantenabc.hu/img/44906/596238/440x440,r/596238.jpg?time=1690947737");

        productList.add(chips);
        productList.add(chocolate);
        productList.add(cheese);
        productList.add(yogurt);
        productList.add(butter);

        return productList;
    }

}
