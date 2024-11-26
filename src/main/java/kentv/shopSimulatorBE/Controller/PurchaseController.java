package kentv.shopSimulatorBE.Controller;

import kentv.shopSimulatorBE.Model.Customer;
import kentv.shopSimulatorBE.Model.Purchase;
import kentv.shopSimulatorBE.Service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping("/purchase/add")
    public void purchase(@RequestBody Purchase purchase) {
        System.out.println("adding purchase in purchase controller");
        // purchaseService.addPurchase(purchase);
    }

    @PostMapping("/purchase/history")
    public List<Purchase> history(@RequestBody Customer customer) {
        return purchaseService.purchaseHistory(customer.getUsername());
    }

}
