package kentv.shopSimulatorBE.Service;

import kentv.shopSimulatorBE.Model.Purchase;
import kentv.shopSimulatorBE.Repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;


    public void addPurchase (Purchase purchase) {
        System.out.println("Added purchase for " + purchase.getUsername());
        purchaseRepository.save(purchase);
    }
}
