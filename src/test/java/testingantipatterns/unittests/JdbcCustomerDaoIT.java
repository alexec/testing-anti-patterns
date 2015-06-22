package testingantipatterns.unittests;

public class JdbcCustomerDaoIT extends CustomerDaoContractTest {

    public JdbcCustomerDaoIT() {
        super(new JdbcCustomerDao());
    }
}