package case_study.repository;

import case_study.data.ReadEmployeeFile;
import case_study.data.WriteEmployeeFile;
import case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeRepository implements IEmployeeRepository {
    private  List<Employee> employeeList = new ArrayList<>();
    private static final String EMPLOYEE_PATH = "src/case_study/data/employee.csv";

    @Override
    public List<Employee> getList() {
        employeeList = ReadEmployeeFile.readEmployee(EMPLOYEE_PATH);
        return employeeList;
    }

    @Override
    public boolean checkId(String id) {
        boolean isEmployee = false;
        for (Employee e : employeeList) {
            if (Objects.equals(e.getId(), id)) {
                isEmployee = true;
                break;
            }
        }
        return isEmployee;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        WriteEmployeeFile.writeEmployee(employeeList, EMPLOYEE_PATH);
    }

    @Override

    public void editEmployee(Employee updateEmployee) {
        int size= employeeList.size();
        for (int i = 0; i < size; i++) {
            if (employeeList.get(i).getId() == updateEmployee.getId()) {
                employeeList.remove(i);
                employeeList.add(i, updateEmployee);
            }
            break;
        }
        WriteEmployeeFile.writeEmployee(employeeList, EMPLOYEE_PATH);
    }

    @Override
    public Employee findId(String id) {
        for (Employee e : employeeList) {
            if (Objects.equals(e.getId(), id)) {
                return e;
            }
        }
        return null;
    }

}
