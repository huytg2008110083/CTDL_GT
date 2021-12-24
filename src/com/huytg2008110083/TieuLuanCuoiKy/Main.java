package com.huytg2008110083.TieuLuanCuoiKy;

import java.util.Scanner;
public class Main {

    static Scanner nhap = new Scanner(System.in);
	public static Kho kho = new Kho();
    public static void main(String[] args) { 
        //HangHoa.add("Thực phẩm ", "HH00120", "thịt gà", "70.000", "100", "11");
        //HangHoa.add("Thực phẩm ", "HH00121", "cá", "40.000", "100", "10");
        //HangHoa.add("Thực phẩm ", "HH00122", "trứng", "50.000", "100", "10");
        //HangHoa.add("Thực phẩm ", "HH00123", "sữa", "20.000", "100", "10");
        //HangHoa.add("Thực phẩm ", "HH00124", "rau", "10.000", "100", "10");
        //HangHoa.add("Thực phẩm ", "HH00125", "củ", "15.000", "120", "10");
        //HangHoa.add("Thực phẩm ", "HH00126", "quả", "45.000", "150", "10");
        //HangHoa.add("Sành Sứ ", "HH00235", "chén", "130.000", "50", "11");
        //HangHoa.add("Sành Sứ ", "HH00236", "dĩa", "200.000", "150", "11");
        //HangHoa.add("Sành Sứ", "HH00237", "bát", "150.000", "150", "11");
        //HangHoa.add("Sành Sứ", "HH00238", "bình gốm", "100.000", "60", "11");
        //HangHoa.add("Điện Máy", "HH00310", "laptop", "15.000.000", "20", "11");
        //HangHoa.add("Điện Máy ", "HH00311", "điện thoại", "5.000.000", "10", "10");
        //HangHoa.add("Điện Máy ", "HH00312", "tủ lạnh", "10.000.000", "5", "10");
        //HangHoa.add("Điện Máy ", "HH00313", "TV1", "4.000.000", "10", "10");
        //HangHoa.add("Điện Máy", "HH00314", "Loa ", "8.000.000", "9", "10");
        //HangHoa.add("Điện Máy", "HH00315", "máy giặc", "12.000.000", "10", "10");
        //HangHoa.add("Điện Máy", "HH00316", "đèn led", "50.000", "50", "10");
        Scanner sc = new Scanner(System.in);
        int Key;
        do{
        	System.out.println();
    		System.out.println("------------MENU---------");
            System.out.println("1)  Them hang			");
            System.out.println("2)  Xoa hang 	");
            System.out.println("3)  Tim hàng theo loai ");
            System.out.println("4)  Tim hang theo gia ");
            System.out.println("5)  In thong tin hang hoa");
            System.out.println("6)  Thong ke hang hoa 	");
            System.out.println("7)  Thoat         		");
            System.out.println("-------------------------");
            System.out.print(" Hay chon chuc nang: ");
            Key = sc.nextInt();
            switch(Key){
        	case 1:	 ThemHang(kho);break;
            case 2:  XoaHang(kho);break;
            case 3:  TimTheoLoai(kho);break;
            case 4:  TimTheoGia(kho);break;
            case 5:  in(kho);break;
            case 6: ThongKe(kho);break;
            default: break;
        }

    } while(Key != 0);
}

public static void ThemHang(Kho kho) {
    kho.ThemHang(nhap);
}
public static void XoaHang(Kho kho) {
    kho.XoaHang(nhap);
}
public static void TimTheoGia(Kho kho) {
    kho.TimTheoGia();
}
public static void TimTheoLoai(Kho kho) {
    kho.TimTheoLoai();
}
public static void in(Kho kho) {
    kho.in();
}
public static void ThongKe(Kho kho) {
    kho.thongKe(nhap);
}

}









