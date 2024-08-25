package main.java.com.ohgiraffers.understand.chap03;

public class Product {

    private String productName;
    private double price;
    private int productStock;

    public Product(String productName, double price, int productStock) {
        this.productName = productName;
        this.price = price;
        this.productStock = productStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    // 재고 확인 메소드
    public boolean isInStock(int quantity){
        return productStock >= quantity;
    }

    // 재고 감소 메소드
    public void reduceStock(int quantity){
        if(isInStock(quantity)){
            productStock -= quantity;
        }
    }
}
