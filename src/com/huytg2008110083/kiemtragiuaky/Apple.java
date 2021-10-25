package com.huytg2008110083.kiemtragiuaky;

import java.util.Scanner;

public class Apple {
    int id;
    int khoiluong;
    String color;
    Scanner sc = new Scanner(System.in);
    Apple(){}
    Apple(int a, int b, String c){
        id = a;
        khoiluong = b;
        color = c;
    }
   
    void nhapthongtin(){
        System.out.println("---------------------------");
        System.out.print("id Apple: ");
        id = sc.nextInt();
        System.out.print("khối lượng: ");
        khoiluong = sc.nextInt();
        System.out.print("color: ");
        color = sc.nextLine();
        sc.nextLine();
        System.out.println("---------------------------");
    }
    void inthongtin(){
        System.out.println("===========================");
        System.out.println("mã id: " + id);
        System.out.println("khối lượng: " + khoiluong);
        System.out.println("color : " + color);
        System.out.println("============================");

    }
}
