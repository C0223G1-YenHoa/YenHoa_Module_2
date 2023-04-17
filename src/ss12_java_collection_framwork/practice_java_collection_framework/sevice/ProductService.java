package ss12_java_collection_framwork.practice_java_collection_framework.sevice;

import ss12_java_collection_framwork.practice_java_collection_framework.model.Product;
import ss12_java_collection_framwork.practice_java_collection_framework.repository.ProductRepo;

import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner sc = new Scanner(System.in);
    ProductRepo productRepo = new ProductRepo();

    @Override
    public void getList() {
        productRepo.getList();
    }

    @Override
    public void add() {
        System.out.println("Nhập mã sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String productName = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int productPrice = Integer.parseInt(sc.nextLine());
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
        int price = Integer.parseInt(sc.nextLine());
        Product product = new Product(id, name, price);
        boolean isEdit = productRepo.edit(productId,product);
        if (isEdit) {
            System.out.println("Bạn đã sửa thành công!");
        } else
            System.out.println("Không tìm thấy tên sản phẩm này");
    }

    @Override
    public void find() {
        System.out.println("Nhập vào mã sản phẩm bạn muốn tìm: ");
        int findId=Integer.parseInt(sc.nextLine());
        productRepo.find(findId);

    }

}
