package case_study.repository;

import case_study.data.ReadFile;
import case_study.data.WriteFile;
import case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String EMPLOYEE_PATH = "src/case_study/data/employee.csv";

    @Override
    public List<Employee> getList() {
        employeeList = ReadFile.readEmployee(EMPLOYEE_PATH);
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
        WriteFile.writeEmployee(employeeList, EMPLOYEE_PATH);
    }

    @Override

    public void editEmployee(Employee updateEmployee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == updateEmployee.getId()) {
                employeeList.remove(i);
                employeeList.add(i, updateEmployee);
            }
            break;
        }
        WriteFile.writeEmployee(employeeList, EMPLOYEE_PATH);
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
