package ss12_java_collection_framwork.practice_java_collection_framework.repository;

import ss12_java_collection_framwork.practice_java_collection_framework.model.Product;


public interface IProductRepo {
    void getList ();

    void add(Product product);

    boolean delete(int id);

    boolean edit(int productId, Product product);
    void find(int productId);
}
