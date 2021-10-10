package com.huytg2008110083.tuan03;

import java.util.Scanner;

public class lab3Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cần kiểm tra: ");
        int n = scanner.nextInt();
        scanner.close();
        boolean cs = true;
        for(int i = 2; i < n-1; i++){
            if(n%i == 0){
                cs = false;
                break;
            }
        }
        if(cs == true)
            System.out.println(n + " là số nguyên tố");
        
        else
            System.out.println(n + " không là số nguyên tố");
        
    }
}
