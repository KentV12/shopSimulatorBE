package kentv.shopSimulatorBE.Config;

import kentv.shopSimulatorBE.Model.Customer;
import kentv.shopSimulatorBE.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Customer> customer = customerRepository.findByUsername(username);
        System.out.println("loading customer: " + username);
        return customer.map(CustomerUserDetails::new).orElseThrow(() -> new UsernameNotFoundException("customer not found"));
    }
}
