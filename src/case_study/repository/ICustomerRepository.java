package case_study.repository;

import case_study.models.Customer;

public interface ICustomerRepository extends IRepository<Customer> {
    void addCustomer(Customer customer);

    boolean checkId(String id);

    void editCustomer(Customer updateCustomer);

    Customer findId(String id);
}
