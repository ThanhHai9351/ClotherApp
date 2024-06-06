package com.example.clotherapp.MODEL;

import java.util.Date;

public class Receipt {
    int id,idUser,idProduct,idPayment,size;
    double totalMoney;
    String color;

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

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(Date paidAt) {
        this.paidAt = paidAt;
    }

    public Receipt(int id, int idUser, int idProduct, int idPayment, int size, double totalMoney, String color, Date paidAt) {
        this.id = id;
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.idPayment = idPayment;
        this.size = size;
        this.totalMoney = totalMoney;
        this.color = color;
        this.paidAt = paidAt;
    }

    Date paidAt;
}
