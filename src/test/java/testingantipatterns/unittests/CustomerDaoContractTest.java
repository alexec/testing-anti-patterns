package testingantipatterns.unittests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public abstract class CustomerDaoContractTest {

    private final CustomerDao customerDao;

    public CustomerDaoContractTest(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Test
    public void duplicateCustomerIdThrowsException() throws Exception {
        Customer customer = new Customer();
        customer.setId(123);

        customerDao.save(customer);

        try {
            customerDao.save(customer);
            fail();
        } catch (IllegalStateException e) {
            assertEquals("duplicate ID", e.getMessage());
        }
    }
}