package testingantipatterns.unittests;

public class CustomerValidator {
    public void validate(Customer customer) {
        if (!customer.getName().matches("[ a-zA-Z]*")) {
            throw new IllegalArgumentException("illegal name");
        }
    }
}
