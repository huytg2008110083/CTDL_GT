package com.huytg2008110083.TieuLuanCuoiKy;

import java.util.Date;
import java.util.Scanner;

public class Kho {
    Node head = null;
    Node tail = null;
    HangHoa hangHoa;
    HangHoa headHangHoa;
    public Kho(){
}
boolean isEmpty(){
    boolean empty =true;
    if (head == null) {
        empty = true;
    } else {
        empty = false;
    }
    return empty;
}
        public void ThemHang(Scanner scanner){
        System.out.println("Ban muon them loai hang nao ?");
        System.out.println("(1) Them hang vao dau danh sach");
        System.out.println("(2) Them hang vao cuoi danh sach");
        System.out.println("Lua chon   ===> (1) (2)");
        int Them = scanner.nextInt();
        
        
        if (Them == 1) {// thêm đầu
            HangHoa hangHoa = new HangHoa();
            Node newNode = new Node(hangHoa);
            newNode.data.NhapThongTin(scanner);
            if (isEmpty()==true) {
                head = newNode;
                tail = newNode;
            }else{
                newNode.next = head;
                head  = newNode;  
            } 
            System.out.println("da them hang hoa");    
        }else if (Them == 2) { // thêm cuối
            HangHoa hangHoa = new HangHoa();
            Node newNode = new Node(hangHoa);
            newNode.data.NhapThongTin(scanner);
            if (isEmpty()==true) {
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail  = newNode;          
            }
            System.out.println("da them hang hoa");
        }
    }
    public void XoaHang(Scanner scanner){
        System.out.println("Ban muon xoa loai hang nao?");
        System.out.println("(1) xoa hang hoa dau danh sach");
        System.out.println("(2) xoa hang hoa cuoi danh sach");
        System.out.println("Lua chon   ===> (1) (2)");
        int Xoa = scanner.nextInt();
        
        if (Xoa == 1) {  //xóa đầu
                if(head == null){
                    System.out.println("Trong");
                    return;
                }
                head = head.next;
                System.out.println("da xoa hang hoa dau danh sach");
            }
        if (Xoa == 2) //xóa cuối
                if (isEmpty()) {
                    
                }
                Node temp;
                temp = head;
                while (temp !=null) {
                   if (temp.next == tail) {
                       tail = temp;
                       tail.next = null;
                   } 
                   temp = temp.next;
                   System.out.println("da xoa hang hoa cuoi danh sach");
                }
            }
        void TimTheoLoai(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Hay nhap loai hang hoa can tim: ");
                String loaiCanTim = sc.nextLine();
                Node current = head;
                while(current != null){
                    if(current.data.Loai.equals(loaiCanTim)){
                        System.out.println("Loai hang hoa can tim: ");
                        current.data.inThongTin();               
                    }
                    current = current.next;
                }
                System.out.println("khong có loai hang hoa can tim");
            }
            void TimTheoGia(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Hay nhap gia hang hoa can tim: ");
                double giaCanTim = sc.nextDouble();
                Node current = head;
                while(current != null){
                    if(current.data.Price == giaCanTim){
                        System.out.println("Gia hang hoa can tim: ");
                        current.data.inThongTin();                
                    }
                    current = current.next;
                }
                System.out.println("khong co gia hang hoa can tim.");
            }
public void in() {
    Node current = head;
    if (head == null) {
        System.out.println("trong");
    } else {
        while (current != null) {
            current.data.inThongTin();
            current = current.next;
        }
    }
}
void thongKe(Scanner scanner){
    Node current = head;
    int Max1 = 0;
    double Max2 = 0;
    if (head == null) {
        System.out.println("trong");
    } else {
        while (current != null) {
            Max1 += current.data.SoLuong;
            Max2 += current.data.Price; 
            current = current.next;
        }
    }
    System.out.println("Tong so luong hang hoa nhap kho: " +Max1);
    System.out.println("Tong gia tri hang hoa nhap kho: " +Max2);     
}

void print(){
    Node current;
    current = head;
    if (head==null) {
        System.out.println("Trong");
        return;
    }
    }
    
}