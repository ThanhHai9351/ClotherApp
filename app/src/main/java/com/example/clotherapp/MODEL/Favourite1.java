package com.example.clotherapp.MODEL;

public class Favourite1 {
    int id,idUser,idProduct;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public Favourite1(int id, int idUser, int idProduct) {
        this.id = id;
        this.idUser = idUser;
        this.idProduct = idProduct;
    }
}
