package kentv.shopSimulatorBE.Controller;

import kentv.shopSimulatorBE.Model.Purchase;
import kentv.shopSimulatorBE.Service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping("/purchase")
    public void purchase(@RequestBody Purchase purchase) {
        purchaseService.addPurchase(purchase);
    }

}
