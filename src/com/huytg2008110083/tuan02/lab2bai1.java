package com.huytg2008110083.tuan02;

import java.util.Scanner;

public class lab2bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double soA = scanner.nextDouble();
        System.out.println("Nhập b:");
        double soB = scanner.nextDouble();
        double x = -soB / soA;
        if(soA == 0){
            if(soB == 0){
                System.out.println("Phương trình vô số nghiệm");
            }else 
                System.out.println("Phương trình vô nghiệm");
        }else
            System.out.printf("Nghiệm của phương trình là x = %.2f",x);

    }
    
}
