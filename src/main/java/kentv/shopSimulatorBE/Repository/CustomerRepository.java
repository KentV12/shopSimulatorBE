package kentv.shopSimulatorBE.Repository;

import kentv.shopSimulatorBE.Model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Optional<Customer> findByUsername(String username);
}
