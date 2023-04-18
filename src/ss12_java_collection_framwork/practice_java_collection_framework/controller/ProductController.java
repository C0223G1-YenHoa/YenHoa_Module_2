package ss12_java_collection_framwork.practice_java_collection_framework.controller;

import ss12_java_collection_framwork.practice_java_collection_framework.sevice.ProductService;

import java.util.Scanner;

public class ProductController {
    private final Scanner sc = new Scanner(System.in);
    private final ProductService productService = new ProductService();

    public void showList() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("---DANH SÁCH SẢN PHẨM---");
            System.out.println("1. Hiển thị danh sách sản phẩm\n" +
                    "2. Thêm sản phẩm \n" +
                    "3. Xóa sản phẩm\n" +
                    "4. Sửa sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm\n" +
                    "6. Thoát\n" +
                    "Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    productService.getList();
                    break;
                case 2:
                    productService.add();
                    break;
                case 3:
                    productService.delete();
                    break;
                case 4:
                    productService.edit();
                    break;
                case 5:
                    productService.find();
                    break;
                case 6:
                    System.out.println("Bạn có muốn thoát khỏi hệ thống? \n" +
                            "1. CÓ\n" +
                            "2. KHÔNG");
                    int choose = Integer.parseInt(sc.nextLine());
                    if (choose == 1) {
                        System.out.println("Bạn đã thoát khỏi hệ thông.");
                        isFlag = false;
                    }
                    break;
            }

        }
    }
}

