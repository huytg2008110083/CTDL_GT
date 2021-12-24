package com.huytg2008110083.TieuLuanCuoiKy;

import java.util.Date;
import java.util.Scanner;

public class HangHoa {
	String Loai;
    String MaHang;
	String NAME;
	double Price;
    int SoLuong;
	Date NgayNhapKho;
	HangHoa next;
	Scanner sc = new Scanner(System.in);

	HangHoa(){
		
	}
	
	HangHoa(String _Loai, String _MaHang, String _NAME, double _Price,int _SoLuong, Date _NgayNhapKho){
        Loai = _Loai;
		MaHang = _MaHang;
		NAME = _NAME;
		Price = _Price;
        SoLuong = _SoLuong;
		NgayNhapKho = _NgayNhapKho;

	}
	
	public void NhapThongTin(Scanner scanner) {
        System.out.print("Loai hang hoa: ");
        Loai = sc.nextLine();
		
		System.out.print("Nhap ma sang pham: ");
		MaHang = sc.nextLine();

		System.out.print("Nhap ten san pham: ");
		NAME = sc.nextLine();
		
		System.out.print("Nhap gia san pham: ");
		Price = sc.nextFloat();

        System.out.print("So luong hang hoa ton kho: ");
        SoLuong = sc.nextInt();
		
		System.out.print("Ngay nhap kho: ");
        long Date = sc.nextLong();
		NgayNhapKho = new Date();
	}
	
	public void inThongTin() {
        System.out.println("=============================");
        System.out.println("Loai hang: " + Loai);
		System.out.println("ten hang: " + NAME);
		System.out.println("Ma hang : " + MaHang);
		System.out.println("Gia : " + Price);
        System.out.println("So luong hang hoa : " + SoLuong);
		System.out.println("Ngay nhap kho : " + NgayNhapKho);
        System.out.println("==============================");
		 
	}
	
	public String GetName() {
		System.out.println(NAME);
		return NAME;
	}
}
