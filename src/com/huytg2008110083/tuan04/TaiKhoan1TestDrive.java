package com.huytg2008110083.tuan04;

import java.util.Scanner;

public class TaiKhoan1TestDrive {
    public static void main(String[] args) {
        TaiKhoan1[] dsTK = new TaiKhoan1[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào danh sách tài khoản");
        for(int i=0; i < dsTK.length; i++){
            System.out.println("Nhập vào tài khoản thứ " + (i+1));
            System.out.print("Chủ tài khoản: ");
            String accountName = scanner.nextLine();
            System.out.print("Số tài khoản: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Số dư: ");
            String balance = scanner.nextLine();
            dsTK[i] = new TaiKhoan1(accountName, accountNumber, balance);
        }

        System.out.println("==========Tài Khoản==========");
        for(TaiKhoan1 account : dsTK){
            account.inThongTin();
        }
    }
}
