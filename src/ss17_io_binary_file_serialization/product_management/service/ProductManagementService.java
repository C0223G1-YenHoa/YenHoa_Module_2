package ss17_io_binary_file_serialization.product_management.service;

import ss17_io_binary_file_serialization.product_management.model.Product;
import ss17_io_binary_file_serialization.product_management.repo.ProductManagementRepo;


import java.util.List;


public class ProductManagementService implements IProductManagementService{
    private static final ProductManagementRepo productRepo=new ProductManagementRepo();

    @Override
    public void getList() {
        List<Product> list=productRepo.getList();
        for (Product p: list) {
            System.out.println(p);
        }
    }

    @Override
    public void add(Product product) {
        productRepo.add(product);
    }

    @Override
    public boolean isCheck(int id) {
        return productRepo.checkId(id);
    }

    @Override
    public void findId(int id) {
         productRepo.findId(id);
    }

}
