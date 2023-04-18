package ss12_java_collection_framwork.practice_java_collection_framework.repository;

import ss12_java_collection_framwork.practice_java_collection_framework.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class ProductRepo implements IProductRepo {
    private final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "IPhone", 12000000));
        productList.add(new Product(2, "Oppo", 10000000));
        productList.add(new Product(3, "SamSung", 11000000));
    }

    @Override
    public ArrayList<Product> getList() {
        productList.sort(Comparator.comparing(Product::getPrice));
        return productList;
    }

    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public boolean delete(int id) {
        boolean isFlag = true;
        for (Product p : productList) {
            if (Objects.equals(p.getId(), id)) {
                System.out.println("Bạn có chắc muốn xóa sản phẩm " + p.getName() + "?\n" +
                        "1. CÓ\n" +
                        "2.KHÔNG\n");
                int option = Integer.parseInt(sc.nextLine());
                if (option == 1) {
                    productList.remove(p);
                } else
                    isFlag = false;
                break;
            }
        }
        return isFlag;

    }

    @Override
    public boolean edit(int productId, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productId == productList.get(i).getId()) {
                productList.set(i, product);
                return true;
            }
        }
        return false;
    }

    @Override
    public Product find(int findId) {
        int index = 0;
        for (int i = 1; i < productList.size(); i++) {
            if (productList.get(i).getId() == findId) {
                index = i;
                break;
            } else
                System.out.println("Không tìm thấy mã sản phẩm này.");
        }
        return productList.get(index);
    }

}

