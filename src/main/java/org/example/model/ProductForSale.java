package org.example.model;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    // Constructor
    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    // Getter metodları
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // getSalesPrice metodu
    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    // showDetails abstract metodu
    public abstract void showDetails();
}
