package ss17_io_binary_file_serialization.product_management.common;

import ss17_io_binary_file_serialization.product_management.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static final String PATH_PRODUCT = "src/ss17_io_binary_file_serialization/product_management/common/product_file";

    public static List<Product> readFile() {
        FileInputStream fileInputStream;
        List<Product> list = new ArrayList<>();
        try {
            fileInputStream = new FileInputStream(PATH_PRODUCT);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
//        } finally {
//            if (fileInputStream != null) {
//                fileInputStream.close();
//            }
//        }
        return list;
    }

}
