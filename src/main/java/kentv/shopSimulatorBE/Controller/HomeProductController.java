package kentv.shopSimulatorBE.Controller;

import kentv.shopSimulatorBE.Model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeProductController {

    @GetMapping("/homeProducts")
    public List<Product> getProduct() {
        List<Product> productList = new ArrayList<>();

        Product chips = new Product("Lays Potato Chips", 3, "Snack",
                "https://karantenabc.hu/img/44906/596238/440x440,r/596238.jpg?time=1690947737");
        Product chocolate = new Product("Chocolate", 5, "Snack",
                "https://i5.walmartimages.com/asr/3cbef0c9-60c4-4953-a699-5940751d16b0.65c1fc53297a6e8bbb095dee12e18801.jpeg?odnHeight=612&odnWidth=612&odnBg=FFFFFF");
        Product cheese = new Product("Shredded Cheese", 6, "Drink",
                "https://crackerbarrel.ca/wp-content/uploads/2022/06/0002_2043510_620g_CB_CB_DOUBCHED_SHRED_3D.png");
        Product yogurt = new Product("Yogurt", 4, "Dairy",
                "https://www.stonyfield.com/wp-content/uploads/2023/03/Greek-0-PLain.png");
        Product butter = new Product("Butter", 5, "Meat",
                "https://www.dairyfoods.com/ext/resources/Food-Photos/Butter_images/Country-Crock-30oz_Rectangle-Tub_-900.jpg");

        productList.add(chips);
        productList.add(chocolate);
        productList.add(cheese);
        productList.add(yogurt);
        productList.add(butter);

        return productList;
    }

}
