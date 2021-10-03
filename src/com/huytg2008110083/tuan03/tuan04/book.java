package com.huytg2008110083.tuan03.tuan04;

public class book {
    double price;
    String publishingCompany;
    String publishingYear;
    double quantity;
    String category;

    book(){};
    book(double pr, String pc, String py, double q, String c){
        price = pr;
        publishingCompany = pc;
        publishingYear = py;
        quantity = q;
        category = c;
    }
    void inThongTin(){
        System.out.println("Giá: " + price + " Nhà xuất bản: " + publishingCompany + " Năm xuất bản: " + publishingYear + " Số lượng: "+ quantity + " Thể loại: " + category);
    }
}
