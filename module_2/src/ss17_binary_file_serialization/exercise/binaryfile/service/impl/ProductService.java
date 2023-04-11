package ss17_binary_file_serialization.exercise.binaryfile.service.impl;

import ss17_binary_file_serialization.exercise.binaryfile.model.Product;
import ss17_binary_file_serialization.exercise.binaryfile.service.IProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct() throws IOException, ClassNotFoundException {
        readProduct();
        Product product = this.infoProduct();
        productList.add(product);
        System.out.println("Thêm mới thành công:");
        writeProduct(productList);
    }

    @Override
    public void displayProduct() throws IOException, ClassNotFoundException {
        readProduct();
        System.out.println("__________Danh sách sản phẩm__________");
        for (Product pro : productList) {
            System.out.println(pro.getInfo(pro));
        }
    }

    @Override
    public void searchProduct() throws IOException, ClassNotFoundException {
        readProduct();
        boolean check = false;
        System.out.println("Nhập mã sản phẩm bạn muốn tìm kiếm:");
        int idCheck = scanner.nextInt();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idCheck) {
                System.out.println(productList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sản phẩm này.");
        }
    }


    public void readProduct() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("src\\ss17_binary_file_serialization\\exercise\\binaryfile\\data\\listProduct.csv");
            objectInputStream = new ObjectInputStream(fileInputStream);
            List<Product> products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void writeProduct(List<Product> produtList) throws IOException {
        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src\\ss17_binary_file_serialization\\exercise\\binaryfile\\data\\listProduct.csv");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            List<Product> productList2 = new ArrayList<>();
            objectOutputStream.writeObject(productList2);

        } catch (IOException e) {
            e.getMessage();
        }
        try {
            objectOutputStream.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public Product infoProduct() {
        System.out.println("Nhập mã sản phâm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tến sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản phẩm");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, manufacturer, price);
        return product;
    }


}
