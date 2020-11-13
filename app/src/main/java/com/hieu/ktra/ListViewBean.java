package com.hieu.ktra;


public class ListViewBean {
    int image;
    String ten;

    public ListViewBean() {
    }

    public ListViewBean(int image,String ten) {
        this.image = image;
        this.ten=ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
}
