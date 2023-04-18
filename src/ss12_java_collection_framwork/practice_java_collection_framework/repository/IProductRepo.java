package ss12_java_collection_framwork.practice_java_collection_framework.repository;

import ss12_java_collection_framwork.practice_java_collection_framework.model.Product;

import java.util.ArrayList;


public interface IProductRepo {
    ArrayList<Product> getList();

    void add(Product product);

    boolean delete(int id);

    boolean edit(int productId, Product product);

    Product find(int findId);
}
