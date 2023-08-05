package kentv.shopSimulatorBE.Repository;

import kentv.shopSimulatorBE.Model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {

}
