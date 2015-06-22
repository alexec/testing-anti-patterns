package testingantipatterns.unittests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CustomerRegistrationServiceTest {

    private final CustomerRegistrationService customerRegistrationService =
            new CustomerRegistrationService(new CustomerValidator(), new FakeCustomerDao());

    @Test
    public void makeSureInvalidCustomerNameCannotBeRegister() throws Exception {

        Customer customer = new Customer();
        customer.setName("£ric");

        try {
            customerRegistrationService.register(customer);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("illegal name", e.getMessage());
        }
    }
}