package org.example.model;

public class User {

    public User() {
    }

    public User(int id, String name, String emailAddress) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    private int id;
    private String name;
    private String emailAddress;


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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        "\n name=" + name +
                        "\n emailAddress=" + emailAddress;
    }
}
