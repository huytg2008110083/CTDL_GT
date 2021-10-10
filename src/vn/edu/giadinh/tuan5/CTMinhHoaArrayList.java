package vn.edu.giadinh.tuan5;

import java.util.ArrayList;
import java.util.List;

import vn.edu.giadinh.tuan4.Dog;

public class CTMinhHoaArrayList {
    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        
        a.add("Gia Huy");
        a.add(true);
        a.add(1);
        a.add(2.5);
        a.add(new Dog(22,"Vàng","Fido"));
        Dog dog = (Dog)a.get(2);
       // System.out.println("Dog name: "+dog.name+" color "+dog.color)

        List bienTCArrayList = new ArrayList();
        bienTCArrayList.add(new Dog(22,"Đen","Fido"));
        System.out.println(bienTCArrayList);
        
        Integer x = (Integer)a.get(2);
        for (Object object : a) {
            System.out.println(a.get(0));
        }
        
    }
}
