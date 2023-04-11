package ss17_binary_file_serialization.exercise.binaryfile.controller;

import ss17_binary_file_serialization.exercise.binaryfile.service.IProductService;
import ss17_binary_file_serialization.exercise.binaryfile.service.impl.ProductService;

import java.io.IOException;
import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductService iProductService = new ProductService();

    public static void menuProduct() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("_____________________________________________________");
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM");
            System.out.println("1: Thêm sản phẩm");
            System.out.println("2: Hiển thị danh sách sản phẩm");
            System.out.println("3: Tìm kiếm sản phẩm");
            System.out.println("4: Thoát chương trình");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.displayProduct();
                    break;
                case 3:
                    iProductService.searchProduct();
                    break;
                case 4:
                    System.exit(0);
                    return;
            }
        }
    }
}
