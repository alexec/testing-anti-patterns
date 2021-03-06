# Testing Anti-Patterns

More a list of bad habits that format anti-patterns.

* Not testing.
* Only manually testing.
* Not unit testing.
* Not integration testing.
* "Testing Triangle" or "Testing Cupcake" rather that Test Pyramid.
* Not testing hard to test things.
* Not doing penetration testing.
* Developers and QAs not communicating.
* QAs testing the wrong thing.

## Unit Testing

* Testing methods, not behaviour
* Unit testing groups of units.
* Testing a feature after it has become hard to change the code.
* Testing configuration, not the behaviour is meant to produce.
* Not testing behaviour.
* One test to rule then all! Testing more than one thing at once.
* Two tests for the same behaviour in the same context. 
* "Greedy Catch" catching exceptions using @Test(expected = "") which is too broad.
* "Free riding". Adding a new assertion to an existing test.
* "The Stranger" Testing two units in one unit test.
* "Introspection" Using reflection to set-up or assert on an object.
* Writing tests after refactoring, rather than before.
* Shared test fixtures. Test fixture is wrong -> all dependant tests are faulty
* Not testing transactionality.  Failure injection testing.

## CI

* Tests that cannot run at the push of a button.
* Not gathering test metrics.
* Using test coverage metrics to assess quality, rather than mutation testing.
* Thinking coverage less than 100% is acceptable. Especially doing CD.
* Tests that don't run on commit, for every commit.
* Tests that don't run as part of a CI pipeline. 
* Suites that take too long to run.
* Not running suites.
* Not monitoring tests suites.
* Ignoring broken tests without planning to fix them.
* Not fixing broken tests.

## Integration Testing

* Tests fakes not accurately mimicking the real deal.
* Integration tests that speak to the database. They risk corrupting the database. Use a testing API.

## Load Testing

* Integration testing without putting your system into known state.
* Not benchmarking load tests.
* Load tests that require manual setup.
* Load tests that cannot be run with a button push.
* Load test output not being captured historically.