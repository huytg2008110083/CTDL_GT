package com.huytg2008110083.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class AppleTestDriver {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Apple> list = new ArrayList<Apple>();
    public static void main(String[] args) {
    MenuApple();
    }
    static void MenuApple(){
        do{
            System.out.println("<<<<<<<<<<<<<<<<<<MENU>>>>>>>>>>>>>");
            System.out.println("|1: thêm táo vào kho               |");
            System.out.println("|2: chọn táo theo màu              |");
            System.out.println("|3: in danh sách táo               |");
            System.out.println("|4: thoát                          |");
            System.out.println("<<<<<<<<<<<<<<<<<<MENU>>>>>>>>>>>>>");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1: nhap(); break;
                case 2: tim(); break;
                case 3: xuat(); break;
                case 4: 
                    System.exit(0); break; 
            }
        }while(true);
    }
   static void nhap(){
       while(true){
           Apple apple;
           apple = new Apple();
           apple.nhapthongtin();
           sc.nextLine();
           list.add(apple);
           System.out.println("nhập thêm (y/n)? : ");
           if(sc.nextLine().equals("n"))
           break;
       }
   }
   static void xuat(){
    for(Apple apple : list){
        apple.inthongtin();
    }
   }
   static void tim(){
       System.out.print("nhập màu Táo cần tìm: ");
       for(Apple apple : list){
           if(sc.nextLine().equals(apple.color)){
               apple.inthongtin();
           }
        }
        
       }
   }





