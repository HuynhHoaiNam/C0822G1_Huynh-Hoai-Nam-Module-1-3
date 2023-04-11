package ss12_collection_framework.exercise.service.impl;


import ss12_collection_framework.exercise.model.Product;
import ss12_collection_framework.exercise.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static List<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
        Product product = this.infoProduct();
        productList.add(product);
        System.out.println("Thêm mới sản phẩm thành công");
    }

    @Override
    public void dislpayAllProduct() {
        for(Product product:productList){
            System.out.println(product);
        }
    }

    public Product infoProduct() {
        System.out.println("Mời nhập mã sản phẩm");
        String id = scanner.nextLine();
        System.out.println("Mời nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Mời nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }
}
