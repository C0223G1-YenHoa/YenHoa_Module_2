package case_study.services;

public interface ICustomerService extends IService{
    void add();
    boolean checkId(String id);
    void editCustomer(String id);

}
