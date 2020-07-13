package com.dmitrykhramov.spring.services;

import com.dmitrykhramov.spring.domain.Customer;
import com.dmitrykhramov.spring.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Dmitry on 02.01.2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("jpadao")
public class CustomerServiceJpaDaoImplTest {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Test
    public void testList() throws Exception {
        List<Customer> customers = (List<Customer>) customerService.listAll();

        assert customers.size() == 3;
    }

    @Test
    public void testSaveWithUser() {

        Customer customer = new Customer();
        User user = new User();
        user.setUsername("This is my user name");
        user.setPassword("MyAwesomePassword");
        customer.setUser(user);

        Customer savedCustomer = customerService.saveOrUpdate(customer);

        assert savedCustomer.getUser().getId() != null;
    }
}
