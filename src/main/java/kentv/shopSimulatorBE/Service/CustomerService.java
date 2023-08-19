package kentv.shopSimulatorBE.Service;

import kentv.shopSimulatorBE.Model.Customer;
import kentv.shopSimulatorBE.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void login(Customer customer) {

    }

    public void addCustomer (Customer customer) {
         customerRepository.save(customer);
    }
}
