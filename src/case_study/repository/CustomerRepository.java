package case_study.repository;

import case_study.data.ReadCustomerFile;
import case_study.data.WriteCustomerFile;
import case_study.models.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerRepository implements ICustomerRepository {
    private  List<Customer> customerList = new ArrayList<>();
    private static final String CUSTOMER_PATH_ = "src/case_study/data/customer.csv";

    @Override
    public List<Customer> getList() {
        customerList = ReadCustomerFile.readCustomer(CUSTOMER_PATH_);
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
        WriteCustomerFile.writeFile(customerList, CUSTOMER_PATH_);
    }

    @Override
    public boolean checkId(String id) {
        boolean isCustomer = false;
        for (Customer c : customerList) {
            if (Objects.equals(c.getId(), id)) {
                isCustomer = true;
                break;
            }
        }
        return isCustomer;

    }

    @Override
    public void editCustomer(Customer updateCustomer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(customerList.get(i).getId(), updateCustomer.getId())) {
                customerList.remove(i);
                customerList.add(i, updateCustomer);
            }
            break;
        }
        WriteCustomerFile.writeFile(customerList, CUSTOMER_PATH_);

    }

    @Override
    public Customer findId(String id) {
        for (Customer c : customerList) {
            if (Objects.equals(c.getId(), id)) {
                return c;
            }
        }
        return null;
    }
}
