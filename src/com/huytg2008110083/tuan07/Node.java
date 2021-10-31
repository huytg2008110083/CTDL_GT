package com.huytg2008110083.tuan07;

public class Node {
    // nội dung
    int data;

    //Liên kết nút tiếp theo
    //Tham chiếu
    Node next;// Biến tham chiếu kiểu Node
    public Node(){}
    
    public Node(int d){
        data = d;
        next = null;
    }
    public Node(int d, Node n){
        data = d;
        next = n;
    }
}
