package case_study.data;

import case_study.models.Customer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteCustomerFile {
    public static void writeFile(List<Customer> customerList, String path){
        File file=new File(path);
        try{
            FileWriter fw=new FileWriter(file);
            BufferedWriter bw=new BufferedWriter(fw);
            for(Customer c: customerList){
            bw.write(c.toWrite());
            bw.newLine();bw.flush();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
