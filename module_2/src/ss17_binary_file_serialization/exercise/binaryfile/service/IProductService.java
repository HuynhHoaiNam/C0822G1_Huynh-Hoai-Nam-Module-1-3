package ss17_binary_file_serialization.exercise.binaryfile.service;

import java.io.IOException;
import java.util.Scanner;

public interface IProductService {
    void addProduct() throws IOException, ClassNotFoundException;

    void displayProduct() throws IOException, ClassNotFoundException;

    void searchProduct() throws IOException, ClassNotFoundException;
}
