package ss12_java_collection_framwork.practice_java_collection_framework.view;

import ss12_java_collection_framwork.practice_java_collection_framework.controller.ProductController;

public class ProductManagement {
    public static void main(String[] args) {
        ProductController productController=new ProductController();
        productController.showList();
    }
}
