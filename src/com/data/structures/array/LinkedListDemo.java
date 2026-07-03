package com.data.structures.array;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
        ll.printLinkedList();
    }


}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}

class LinkedList{
    Node head;

    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node cur=head;
        while(cur.next!=null) {
            cur = cur.next;
        }
        cur.next=newNode;
    }

    public void printLinkedList(){
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
}

