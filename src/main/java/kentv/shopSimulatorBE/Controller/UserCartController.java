package kentv.shopSimulatorBE.Controller;

import kentv.shopSimulatorBE.Model.UserCart;
import kentv.shopSimulatorBE.Service.UserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCartController {

    @Autowired
    private UserCartService userCartService;

    @PostMapping("/addCart")
    public void addCart(@RequestBody UserCart userCart) {
        userCartService.addCart(userCart);
    }

}
