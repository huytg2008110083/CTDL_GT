package com.huytg2008110083.tuan03.tuan04;

public class Student {
    String name;
    int age;

    Student (){};
    Student(String n, int a){
        name = n;
        age = a;
    }
    void inThongTin(){
        System.out.println("name: " + name + " age: "+ age);
    }
    
}
