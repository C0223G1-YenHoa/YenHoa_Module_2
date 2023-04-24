package ss17_io_binary_file_serialization.product_management.repo;

import ss17_io_binary_file_serialization.product_management.model.Product;

import java.util.List;

public interface IProductManagementRepo {
    List<Product>getList();
    void add(Product product);
    boolean checkId(int id);
    void findId(int id);
}
