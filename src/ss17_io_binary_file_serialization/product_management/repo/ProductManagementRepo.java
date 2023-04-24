package ss17_io_binary_file_serialization.product_management.repo;


import ss17_io_binary_file_serialization.product_management.common.ReadFile;
import ss17_io_binary_file_serialization.product_management.common.WriteFile;
import ss17_io_binary_file_serialization.product_management.model.Product;


import java.util.List;

public class ProductManagementRepo implements IProductManagementRepo{
//    private static final List<Product> productList=new ArrayList<>();

//    static {
//            productList.add(new Product(1,"IphoneX",12000,"Apple","Điện thoại hình chữ nhật"));
//            productList.add(new Product(2,"SamSungNote9",11000,"SamSung","Điện thoại gập"));
//            productList.add(new Product(3,"OppoF11",10000,"Oppo","Điện thoại hình chữ nhật"));
//    }
    @Override
    public List<Product> getList() {
        return ReadFile.readFile();
    }

    @Override
    public void add(Product product) {
        List<Product> list= ReadFile.readFile();
        list.add(product);
        WriteFile.writeFile(list);
    }

    @Override
    public boolean checkId(int id) {
        List<Product> list=ReadFile.readFile();
        boolean isCheck=false;
        for (Product p: list) {
            if(p.getId()==id){
                isCheck=true;
                break;
            }
        }
        return isCheck;
    }

    @Override
    public void findId(int id) {
        List<Product> list=ReadFile.readFile();
        for (Product p: list) {
            if(p.getId()==id){
                System.out.println(p);
            }
        }
    }
}
