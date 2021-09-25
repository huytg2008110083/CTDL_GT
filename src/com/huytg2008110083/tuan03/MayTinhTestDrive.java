package com.huytg2008110083.tuan03;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        
        MayTinh mayTinh;
        mayTinh = new MayTinh();
        mayTinh.NhaSanXuat = "DELL";
        mayTinh.NamSanXuat = 2017;
        mayTinh.HeDieuHanh = "Microsoft Windows";
        mayTinh.Ram = "8GB";
        mayTinh.CPU = "InTel(R) Core(TM) i5-4210U @ 1.70GHz 2.40GHz";
        mayTinh.Gia = "15000000VND";
        mayTinh.BaoHanh = "3 năm";


        mayTinh.inThongTinMayTinh();
    }
}
