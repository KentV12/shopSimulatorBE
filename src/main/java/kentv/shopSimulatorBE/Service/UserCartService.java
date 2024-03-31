package kentv.shopSimulatorBE.Service;

import kentv.shopSimulatorBE.Model.UserCart;
import kentv.shopSimulatorBE.Repository.UserCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCartService {

    @Autowired
    private UserCartRepository userCartRepository;

    public void addCart(UserCart userCart) {
        System.out.println("adding to cart");
        userCartRepository.save(userCart);
    }

}
