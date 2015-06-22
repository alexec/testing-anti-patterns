package testingantipatterns.unittests;

public class FakeCustomerDaoTest extends CustomerDaoContractTest {

    public FakeCustomerDaoTest() {
        super(new FakeCustomerDao());
    }
}