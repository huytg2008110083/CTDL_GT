package com.huytg2008110083.tuan03;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        
        TaiKhoan taiKhoan;
        taiKhoan = new TaiKhoan();
        taiKhoan.TenChuTaiKhoan = "Trần Gia Huy";
        taiKhoan.SoTaiKhoan = "2008110083";
        taiKhoan.SoDuTrongTaiKhoan = "11000000VND";

        taiKhoan.inThongTinChuTaiKhoan();
    }
}
