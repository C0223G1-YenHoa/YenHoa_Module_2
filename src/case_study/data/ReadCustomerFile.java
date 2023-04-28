package case_study.data;

import case_study.models.Customer;
import case_study.services.EnumCustomerType;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCustomerFile {
    public static List<Customer> readCustomer(String path) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while (true) {
                if ((line = br.readLine()) != null && !line.equals("")) {
                    String[] customerArray = line.split(",");
                    Customer customer = new Customer(customerArray[0], customerArray[1], customerArray[2],
                            customerArray[3], customerArray[4], customerArray[5], customerArray[6], EnumCustomerType.valueOf(customerArray[7]),
                            customerArray[8]);
                    customerList.add(customer);
                } else {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
