package org.example.model;

public class Product {

    public Product() {
    }

    public Product( String name, int unitPrice, Category category) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.category = category;
    }

    private int id;
    private String name;
    private int unitPrice;

    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }


    @Override
    public String toString() {
        return
                "name=" + name +
                "\nunitPrice=" + unitPrice +
                "\ncategory=" + category.getCategoryName() ;
    }
}
