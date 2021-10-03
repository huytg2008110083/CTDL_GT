package com.huytg2008110083.tuan03.tuan04;

public class TaiKhoan1 {
    String accountName;
    String accountNumber;
    String balance;

    TaiKhoan1(){};
    TaiKhoan1(String aName, String aNum, String b){
        accountName = aName;
        accountNumber = aNum;
        balance = b;
    }
    void inThongTin(){
        System.out.println("Tên chủ tài khoản: " + accountName + " Số tài khoản: " + accountNumber + " Số dư: " + balance);
    }
}
