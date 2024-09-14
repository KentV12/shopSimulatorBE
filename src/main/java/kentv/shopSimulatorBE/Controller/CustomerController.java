package kentv.shopSimulatorBE.Controller;

import kentv.shopSimulatorBE.Model.AuthRequest;
import kentv.shopSimulatorBE.Model.Customer;
import kentv.shopSimulatorBE.Service.CustomerService;
import kentv.shopSimulatorBE.Service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/userlogin")
    public void login(@RequestBody Customer customer) {
        System.out.println("logging in " + customer.getId());
        // customerService.loginCustomer(customer);
    }

    @PostMapping("/register")
    public void register(@RequestBody Customer customer) {
        // System.out.println("registering " + customer.getUsername());
         customer.setRoles("ROLE_USER");
         customerService.addCustomer(customer);
    }

    // an endpoint that receives username and password and generates a token
    @PostMapping("/authenticate")
    public String authenticate(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(authRequest.getUsername());
        } else {
            throw new UsernameNotFoundException("Invalid User Request!");
        }
    }

}
