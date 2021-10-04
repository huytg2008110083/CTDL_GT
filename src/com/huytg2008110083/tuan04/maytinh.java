package com.huytg2008110083.tuan04;

public class maytinh {
    String publishingCompany;
    String publishingYear;
    String operatingSystem;
    String ram;
    String cpu;
    String price;
    String warrantyYear;

    maytinh(){};
    maytinh(String pc, String py, String os, String r, String c, String p, String wy){
        publishingCompany = pc;
        publishingYear = py;
        operatingSystem = os;
        ram = r;
        cpu = c;
        price = p;
        warrantyYear = wy;
    }
    void inThongTin(){
        System.out.println("Nhà sản xuất: " + publishingCompany + " Năm sản xuất: " + publishingYear + " Hệ điều hành: " + operatingSystem + " RAM: " + ram + " CPU: " + cpu + " Giá: " + price + " Năm bảo hành: " + warrantyYear);
    }
}
