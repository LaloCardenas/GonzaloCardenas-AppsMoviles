package com.example.webservices;

public class Contact {
    String name;
    String phone;
    String imagenUrl;

    public Contact(String name, String phone, String imagenUrl) {
        this.name = name;
        this.phone = phone;
        this.imagenUrl = imagenUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
