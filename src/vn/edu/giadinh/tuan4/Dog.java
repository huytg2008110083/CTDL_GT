package vn.edu.giadinh.tuan4;

public class Dog {
    String name;

    int size;
    String color;
    public Dog(){
        
    }
    public Dog(int s){//Hàm tạo 1 tham số
        size =s;
    }
    public Dog(int s, String c,String n){//Hàm tạo 2 tham số
        size = s;
        color =c;
        name = n;
        
    }
    void inThongTin(){
        System.out.println("Size = "+size+" "+"color = "+color+"name = "+name);
    }
}
