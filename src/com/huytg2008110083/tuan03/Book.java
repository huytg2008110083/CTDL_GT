package com.huytg2008110083.tuan03;

public class Book {
    //1.Thuoc Tinh
    double Gia;
    String NhaXuatBan;
    double NamXuatBan;
    double GiaBan;
    int SoLuong;
    
    //2.Phuong Thuc
    void inThongTinSach(){

        System.out.println("Giá Sách Của Hãng: " + Gia);
        System.out.println("Nhà Xuất Bản: " + NhaXuatBan);
        System.out.println("Năm Xuất Bản: " + NamXuatBan);
        System.out.println("Giá Bán Của Nhà Sách: " + GiaBan);
        System.out.println("Số Lượng: " + SoLuong);
    } 
    
}
