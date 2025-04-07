package org.example.model;

public class Chocolate extends ProductForSale {
    private String cocoaContent;

    public Chocolate(String type, double price, String description, String cocoaContent) {
        super(type, price, description);
        this.cocoaContent = cocoaContent;
    }

    public String getCocoaContent() {
        return cocoaContent;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate - Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription() + ", Cocoa Content: " + cocoaContent);
    }
}
