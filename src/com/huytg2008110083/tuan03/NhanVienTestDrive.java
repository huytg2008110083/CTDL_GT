package com.huytg2008110083.tuan03;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanVien;
        nhanVien = new NhanVien();
        nhanVien.TenNhanVien = "Trần Gia Huy";
        nhanVien.Luong = 7300000d;
        nhanVien.DiaChi = "94A4, Phùng Văn Cung, Phường 7,Quận Phú Nhận, TP. HCM ";
        nhanVien.BoPhanLamViec = "Thu Ngân,Tiếp thị";
        nhanVien.NgaySinh = "1/11/2002";

        nhanVien.inThongTinNhanVien();
}

}