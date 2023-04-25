package ss17_io_binary_file_serialization.product_management.controller;

import ss17_io_binary_file_serialization.product_management.model.Product;
import ss17_io_binary_file_serialization.product_management.service.ProductManagementService;

import java.util.Scanner;

public class ProductManagementController {
    private final Scanner sc= new Scanner(System.in);
    private static final ProductManagementService productService=new ProductManagementService();

    public void showProductList(){
        boolean flag=true;
        while(flag){
            System.out.println("---QUẢN LÝ SẢN PHẨM---\n" +
                    "1. Hiển thị danh sách\n" +
                    "2. Thêm sản phẩm\n" +
                    "3. Tìm kiếm thông tin sản phẩm \n" +
                    "4. Thoát\n" +
                    "Nhập lựa chọn của bạn: ");
            int choose=Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    productService.getList();
                    break;
                case 2:
                    productService.add();
                    break;
                case 3:
                    System.out.println("Nhập mã sản phẩm bạn muốn tìm: ");
                    int findId=Integer.parseInt(sc.nextLine());
                    productService.findId(findId);
                    break;
                case 4:
                    System.out.println("Bạn muốn thoát khỏi hệ thống?\n" +
                            "1. Có\n" +
                            "2. Không");
                    int choice=Integer.parseInt(sc.nextLine());
                    if (choice==1){
                        flag=false;
                        break;
                    }
            }
        }
    }
}
