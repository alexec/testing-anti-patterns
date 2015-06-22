package testingantipatterns.unittests;

public class CustomerRegistrationService {

    private final CustomerValidator customerValidator;
    private final CustomerDao customerDao;

    public CustomerRegistrationService(CustomerValidator customerValidator, CustomerDao customerDao) {
        this.customerValidator = customerValidator;
        this.customerDao = customerDao;
    }

    public void register(Customer customer) {
        customerValidator.validate(customer);

        customerDao.save(customer);
    }
}
