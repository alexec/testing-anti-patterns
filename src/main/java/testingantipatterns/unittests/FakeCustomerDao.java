package testingantipatterns.unittests;

import java.util.HashMap;
import java.util.Map;

/**
 * A test fake for {@link JdbcCustomerDao}.
 */
public class FakeCustomerDao implements CustomerDao {
    private final Map<Integer, Customer> store = new HashMap<Integer, Customer>();

    public void save(Customer customer) {
        int key = customer.getId();
        if (store.containsKey(key)) {
            throw new IllegalStateException("duplicate ID");
        }
        store.put(key, customer);
    }
}
