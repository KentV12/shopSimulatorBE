package kentv.shopSimulatorBE.Service;

import kentv.shopSimulatorBE.Model.Purchase;
import kentv.shopSimulatorBE.Repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public void addPurchase(Purchase purchase) {
        System.out.println("Added purchase for " + purchase.getUsername() + " with $" + purchase.getPrice());
        // purchaseRepository.save(purchase);
    }

    public List<Purchase> purchaseHistory(String username) {
        return purchaseRepository.findByUsername(username);
    }


}
