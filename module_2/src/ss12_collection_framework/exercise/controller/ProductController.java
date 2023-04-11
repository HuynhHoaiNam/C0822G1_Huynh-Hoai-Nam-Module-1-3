package ss12_collection_framework.exercise.controller;

import ss12_collection_framework.exercise.service.IProductService;
import ss12_collection_framework.exercise.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductService iProductService = new ProductService();

    public static void menuProduct() {
        while (true) {
            System.out.println("______________________________________________");
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẢM");
            System.out.println("1: Thêm mới sản phẩm");
            System.out.println("2: Hiển thị danh sách sản phẩm");
            System.out.println("3: Xoá sản phẩm");
            System.out.println("4: Sửa sản phẩm");
            System.out.println("5: Tìm kiếm sản phẩm theo tên");
            System.out.println("6: Sắp xếp sản phẩm tăng dần");
            System.out.println("7: Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.dislpayAllProduct();
                    break;
            }
        }
    }
}