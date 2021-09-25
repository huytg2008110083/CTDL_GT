package com.huytg2008110083.tuan03;

public class BookTestDrive {
    public static void main(String[] args) {
        Book book;
        book = new Book();
        book.Gia = 50000;
        book.NhaXuatBan = "Giáo Dục Việt Nam";
        book.NamXuatBan = 2021;
        book.GiaBan = 500000;
        book.SoLuong = 10;
        
        
        book.inThongTinSach();
    }
}
