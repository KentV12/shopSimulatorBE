package kentv.shopSimulatorBE.Controller;

import kentv.shopSimulatorBE.Model.Customer;
import kentv.shopSimulatorBE.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/login")
    public String login(@RequestBody Customer customer) {
        String username = customer.getId();
        String password = customer.getPassword();

        return "Received: " + username + " and " + password;
    }

    @PostMapping("/register")
    public String register(@RequestBody Customer customer) {
        String username = customer.getId();
        String password = customer.getPassword();

        customerService.addCustomer(customer);

        return "Register: " + username + " and " + password;
    }

}
