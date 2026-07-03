package com.data.structures.array;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
        MyThread t2=new MyThread();
        t2.start();
        MyThread t3=new MyThread();
        t3.start();
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("Running thread via extending Thread -> ");
    }
}
