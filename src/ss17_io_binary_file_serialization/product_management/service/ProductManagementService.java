package ss17_io_binary_file_serialization.product_management.service;

import ss17_io_binary_file_serialization.product_management.model.Product;
import ss17_io_binary_file_serialization.product_management.repo.ProductManagementRepo;


import java.util.List;
import java.util.Scanner;


public class ProductManagementService implements IProductManagementService{
    private final Scanner sc= new Scanner(System.in);
    private static final ProductManagementRepo productRepo=new ProductManagementRepo();

    @Override
    public void getList() {
        List<Product> list=productRepo.getList();
        for (Product p: list) {
            System.out.println(p);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập mã sản phẩm: ");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name=sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price=Double.parseDouble(sc.nextLine());
        System.out.println("Nhập Hãng sản xuất: ");
        String brand=sc.nextLine();
        System.out.println("Mô tả sản phẩm: ");
        String description=sc.nextLine();
        Product newProduct=new Product(id,name,price,brand,description);
        productRepo.add(newProduct);
    }

    @Override
    public boolean isCheck(int id) {
        return productRepo.checkId(id);
    }

    @Override
    public void findId(int id) {
        boolean checkId= isCheck(id);
        if(!checkId){
            System.out.println("Không tìm thấy sản phẩm này.");
        } else {
            productRepo.findId(id);
        }
    }

}
