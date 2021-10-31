package com.huytg2008110083.tuan06;

public class MangSanPham {
    String TenSanPham;
    Double DonGia;
    Double GiamGia;
    Double ThueNhapKhau;

   public  MangSanPham(){}

    MangSanPham(String tsp, Double dg, Double gg, Double tnk){
        TenSanPham = tsp;
        DonGia = dg;
        GiamGia = gg;
        ThueNhapKhau = tnk;
    } 
    void inThongTin(){
        System.out.println("Tên Sản Phẩm: "+TenSanPham+"Đơn Giá: "+DonGia+"Giảm Giá: "+GiamGia+"Thuế Nhập Khẩu: "+ThueNhapKhau);
    }
}
