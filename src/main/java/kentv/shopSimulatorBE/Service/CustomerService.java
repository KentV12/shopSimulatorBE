package kentv.shopSimulatorBE.Service;

import kentv.shopSimulatorBE.Model.Customer;
import kentv.shopSimulatorBE.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void loginCustomer(Customer customer) {

    }

    public void addCustomer (Customer customer) {
        System.out.println("registering " + customer.getUsername());
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        customerRepository.save(customer);
    }
}
