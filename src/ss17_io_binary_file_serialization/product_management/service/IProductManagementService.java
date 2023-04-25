package ss17_io_binary_file_serialization.product_management.service;


import ss17_io_binary_file_serialization.product_management.model.Product;

public interface IProductManagementService {
    void getList();
    void add();
    boolean isCheck(int id);
    void findId(int id);
}
