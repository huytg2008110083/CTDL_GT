package com.huytg2008110083.tuan03.tuan04;

public class dog {
    String name;
    int size;
    String color;

    public dog(int s) {
        size = s;    
    }
    public dog(int s, String c, String n) {
        size = s;
        color = c;
        name = n;
    }
    void inThongTin(){
        System.out.println("Size =" + size + " "+ "color = "+ color + " " + " name");
    }
    
}
