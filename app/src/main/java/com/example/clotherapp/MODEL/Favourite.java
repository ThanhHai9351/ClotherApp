package com.example.clotherapp.MODEL;

public class Favourite {
    String name;
    int img;

    public String getName() {
        return name;
    }

    public Favourite(String name, int img, int price) {
        this.name = name;
        this.img = img;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int price;
}
