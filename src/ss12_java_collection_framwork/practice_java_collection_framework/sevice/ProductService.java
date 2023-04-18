package ss12_java_collection_framwork.practice_java_collection_framework.sevice;

import ss12_java_collection_framwork.practice_java_collection_framework.model.Product;
import ss12_java_collection_framwork.practice_java_collection_framework.repository.ProductRepo;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements IProductService {
    private final Scanner sc = new Scanner(System.in);
    private final ProductRepo productRepo = new ProductRepo();

    @Override
    public void getList() {
        ArrayList<Product> productList= productRepo.getList();
        for (Product s: productList) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập mã sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String productName = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double productPrice = Double.parseDouble(sc.nextLine());
        Product newProduct = new Product(id, productName, productPrice);
        productRepo.add(newProduct);
    }

    @Override
    public void delete() {
        this.getList();
        System.out.println("Nhập mã sản phẩm bạn muốn xóa: ");
        int choice = Integer.parseInt(sc.nextLine());
        boolean isDelete = productRepo.delete(choice);
        if (isDelete) {
            System.out.println("Bạn đã xóa thành công.");
        } else
            System.out.println("Không tìm thấy.");
    }

    @Override
    public void edit() {
        this.getList();
        System.out.println("Nhập mã sản phẩm bạn muốn chỉnh sửa: ");
        int productId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mã sản phẩm :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm :");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(sc.nextLine());
        Product product = new Product(id, name, price);
        boolean isEdit = productRepo.edit(productId, product);
        if (isEdit) {
            System.out.println("Bạn đã sửa thành công!");
        } else
            System.out.println("Không tìm thấy tên sản phẩm này");
    }

    @Override
    public void find() {
        System.out.println("Nhập vào mã sản phẩm bạn muốn tìm: ");
        int findId = Integer.parseInt(sc.nextLine());
        System.out.println(productRepo.find(findId));
    }

}
