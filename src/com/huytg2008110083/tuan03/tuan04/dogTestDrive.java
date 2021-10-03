package com.huytg2008110083.tuan03.tuan04;

public class dogTestDrive {
    public static void main(String[] args){
        dog[] danhsachDog = new dog[7];

        dog dog0 = new dog(10, "Đen", "Fido");
        dog dog1 = new dog(7, "Vàng", "La La");
        dog dog2 = new dog(25, "Đen Trắng", "LuLu");
        dog dog3 = new dog(11, "Nâu", "KiKi");
        dog dog4 = new dog(20, "Nâu Đen", "Hoho");
        dog dog5 = new dog(19,"Đen", "HaHa");
        dog dog6 = new dog(4, "Đen thui", "Hihi");

        danhsachDog[0] = dog0;
        danhsachDog[1] = dog1;
        danhsachDog[2] = dog2;
        danhsachDog[3] = dog3;
        danhsachDog[4] = dog4;
        danhsachDog[5] = dog5;
        danhsachDog[6] = dog6;

        for(int i = 0; i < danhsachDog.length; i++){
            danhsachDog[i].inThongTin();
        }
    }
}
