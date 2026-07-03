package com.data.structures.array;

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThreadRun th1=new MyThreadRun();
        Thread t1=new Thread(th1);
        t1.start();
    }
}

class MyThreadRun implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable interface");
    }
}
