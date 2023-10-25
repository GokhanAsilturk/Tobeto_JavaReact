package org.example;

import org.example.model.Category;
import org.example.model.Order;
import org.example.model.Product;
import org.example.model.User;

public class Main {
    public static void main(String[] args) {


        User userGokhan = new User("Gökhan", "gokhanasilturkk@gmail.com");


        Category categoryLaptop = new Category("Laptop");

        Product product = new Product("Lenovo", 1500, categoryLaptop);

        Order order = new Order(product, userGokhan, "Istanbul");


        System.out.println("Kullanıcı bilgileri: \n" + userGokhan + "\n--------------");
        System.out.println("Mevcut Kategori: \n" + categoryLaptop + "\n--------------");
        System.out.println("Mevcut Ürün: \n" + product + "\n--------------");
        System.out.println("Sipariş Bilgileri: \n" + order);

    }
}