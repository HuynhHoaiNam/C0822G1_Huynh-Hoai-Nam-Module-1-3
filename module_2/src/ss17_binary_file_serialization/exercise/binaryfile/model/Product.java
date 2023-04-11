package ss17_binary_file_serialization.exercise.binaryfile.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String manufacturer;
    private int price;

    public Product() {
    }

    public Product(int id, String name, String manufacturer, int price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " +
                "Mã sản phẩm: " + id +
                ", Tên sản phẩm: " + name +
                ", Hãng sản phẩm: " + manufacturer +
                ", Giá sản phẩm: " + price
                ;
    }

    public String getInfo(Product product) {
        return  product.getId() + ", " + product.getName() + ", " + product.getManufacturer() + ", " + product.getPrice();
    }
}
