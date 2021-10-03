package com.huytg2008110083.tuan03.tuan04;

import java.util.Scanner;


public class StudentTestDrive {
    public static void main(String[] args) {
        Student[] studentList = new Student[2];

        Scanner varInput = new Scanner(System.in);

        System.out.println("Nhập vào danh sách sinh viên:");

        for(int i = 0; i < studentList.length; i++){
            System.out.print("Nhập sinh viên thứ " + (i+1));
            System.out.print("Tên sinh viên: ");
            String name = varInput.nextLine();
            System.out.print("Tuổi: ");
            int age = varInput.nextInt();
            studentList[i] = new Student(name, age);
        }

        System.out.println("===================in danh sách sinh viên sau nhập====================");
        for(Student student: studentList){
            student.inThongTin();
        }
        
    }
    
}
