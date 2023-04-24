package ss17_io_binary_file_serialization.product_management.view;

import ss17_io_binary_file_serialization.product_management.controller.ProductManagementController;

public class ProductView {
    public static void main(String[] args) {
        ProductManagementController productController =new ProductManagementController();
        productController.showProductList();
    }
}
