package org.example.model;

public class Order {
    public Order() {
    }

    public Order(int id, Product product, String userName, String adress) {
        this.id = id;
        this.product = product;
        this.userName = userName;
        this.adress = adress;
    }

    private int id;
    private Product product;
    private String userName;
    private String adress;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                        "product=" + product.getName() +
                        "\nuserName=" + userName +
                        "\nadress=" + adress;
    }
}
