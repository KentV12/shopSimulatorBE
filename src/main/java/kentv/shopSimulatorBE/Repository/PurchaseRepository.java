package kentv.shopSimulatorBE.Repository;

import kentv.shopSimulatorBE.Model.Purchase;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {
    List<Purchase> findByUsername(String username);
}
