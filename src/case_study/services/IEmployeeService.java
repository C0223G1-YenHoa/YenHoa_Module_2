package case_study.services;


public interface IEmployeeService extends IService{
    void addEmployee();
    boolean checkId(String id);
    void editEmployee(String id);
}
