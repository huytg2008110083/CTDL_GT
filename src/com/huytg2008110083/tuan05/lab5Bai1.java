package com.huytg2008110083.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class lab5Bai1 {
    public static void main(String[] args) {
        ArrayList <Double> list = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Nhập số: ");
            double x = scanner.nextDouble();
            list.add(x);
            System.out.print("Nhập thêm (y/n)?: ");
            scanner.nextLine();
            if(scanner.nextLine().equals("n"))
                break;
        }
        double tong = 0;
        for (Double x : list) {
            System.out.print(x + "    ");
            tong += x;
        }
        System.out.println("Tổng các phần tử = " + tong);
        scanner.close();
    }
}
