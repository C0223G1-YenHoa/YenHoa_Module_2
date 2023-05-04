package case_study.data;

import case_study.models.Employee;
import case_study.services.EnumEmployeeGrade;
import case_study.services.EnumEmployeePosition;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadEmployeeFile {
    public static List<Employee> readEmployee(String path) {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fr = null;
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while (true) {
                if (!((line = br.readLine()) != null && !line.equals(""))) break;
                String[] employeeArray = line.split(",");
                Employee employee = new Employee(employeeArray[0], employeeArray[1], employeeArray[2],
                        employeeArray[3], employeeArray[4], employeeArray[5], employeeArray[6], EnumEmployeeGrade.valueOf(employeeArray[7]),
                        EnumEmployeePosition.valueOf(employeeArray[8]), Double.parseDouble(employeeArray[9]));
                employeeList.add(employee);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}