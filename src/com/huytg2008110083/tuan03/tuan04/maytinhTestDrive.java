package com.huytg2008110083.tuan03.tuan04;

import java.util.Scanner;

public class maytinhTestDrive {
    public static void main(String[] args) {
        maytinh[] MT = new maytinh[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào danh sách máy tính");
        for(int i=0; i < MT.length; i++){
            System.out.println("Nhập vào máy tính thứ " + (i+1));
            System.out.print("Nhà sản xuất: ");
            String publishingCompany = scanner.nextLine();
            System.out.print("Năm sản xuất: ");
            String publishingYear = scanner.nextLine();
            System.out.print("Hệ điều hành: ");
            String operatingSystem = scanner.nextLine();
            System.out.print("Ram: ");
            String ram = scanner.nextLine();
            System.out.print("CPU: ");
            String cpu = scanner.nextLine();
            System.out.print("Giá: ");
            String price = scanner.nextLine();
            System.out.print("Năm bảo hành: ");
            String warrantyYear = scanner.nextLine();
            MT[i] = new maytinh(publishingCompany, publishingYear, operatingSystem, ram, cpu, price, warrantyYear);
        }

        System.out.println("==========Máy tính==========");
        for(maytinh Maytinh : MT){
            Maytinh.inThongTin();
        }
    }
}
