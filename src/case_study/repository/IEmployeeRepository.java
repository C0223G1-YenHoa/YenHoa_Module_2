package case_study.repository;

import case_study.models.Employee;

public interface IEmployeeRepository extends IRepository <Employee>{
    void addEmployee(Employee employee);
    boolean checkId(String id);
    void editEmployee(Employee updateEmployee);
    Employee findId(String id);

}
