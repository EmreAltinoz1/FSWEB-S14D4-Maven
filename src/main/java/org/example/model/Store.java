package org.example.model;

import java.util.List;

public class Store {
    public void listProducts(List<ProductForSale> products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        // Ürünleri oluşturuyoruz
        ProductForSale chocolate = new Chocolate("Milk Chocolate", 15.0, "Delicious milk chocolate", "30%");
        ProductForSale coke = new Coke("Coke", 5.0, "Refreshing soda", true);
        ProductForSale bread = new Bread("Whole Wheat Bread", 2.0, "Freshly baked whole wheat bread", "Whole Wheat");

        // Ürünleri bir diziye ekliyoruz
        List<ProductForSale> products = List.of(chocolate, coke, bread);

        // Store nesnesi oluşturuluyor ve listProducts metoduna ürünler gönderiliyor
        Store store = new Store();
        store.listProducts(products);
    }
}
