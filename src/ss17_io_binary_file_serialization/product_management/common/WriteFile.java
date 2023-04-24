package ss17_io_binary_file_serialization.product_management.common;

import ss17_io_binary_file_serialization.product_management.model.Product;

import java.io.*;
import java.util.List;

public class WriteFile {
    public static final String PATH_PRODUCT="src/ss17_io_binary_file_serialization/product_management/common/product_file";

    public static void writeFile(List<Product> productList) {
        FileOutputStream fileOutputStream ;
        try{
            fileOutputStream=new FileOutputStream(PATH_PRODUCT);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
