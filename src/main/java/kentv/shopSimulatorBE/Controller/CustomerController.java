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
    public void login(@RequestBody Customer customer) {
        customerService.login(customer);
    }

    @PostMapping("/register")
    public void register(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

}
