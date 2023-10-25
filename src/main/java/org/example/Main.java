package org.example;

import org.example.model.Category;
import org.example.model.Order;
import org.example.model.Product;
import org.example.model.User;

public class Main {
    public static void main(String[] args) {


        User userGokhan = new User();
        userGokhan.setName("Gökhan");
        userGokhan.setEmailAddress("gokhanasilturkk@gmail.com");

        Category categoryLaptop = new Category();
        categoryLaptop.setCategoryName("Laptop");

        Product product = new Product();
        product.setName("Lenovo");
        product.setUnitPrice(1500);
        product.setCategory(categoryLaptop);

        Order order = new Order();
        order.setAdress("Istanbul");
        order.setProduct(product);
        order.setUserName(userGokhan.getName());


        System.out.println("Kullanıcı bilgileri: \n" + userGokhan + "\n--------------");
        System.out.println("Mevcut Kategori: \n" + categoryLaptop + "\n--------------");
        System.out.println("Mevcut Ürün: \n" + product + "\n--------------");
        System.out.println("Sipariş Bilgileri: \n" + order);

    }
}