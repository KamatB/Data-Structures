package com.data.structures.array;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

class Synchron extends Thread {

    public void printThreads(int n) {
        System.out.println("Thread" + n + "is in process");
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                Arrays.asList(e.getStackTrace());
            }
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            Arrays.asList(e.getStackTrace());
        }
    }

    public static class MyThread1 extends Thread{
        Synchron s;
        public MyThread1(Synchron p){
            s=p;
        }

        @Override
        public void run() {
            s.printThreads(1);
        }
    }
    public static class MyThread2 extends Thread{
        Synchron s;
        public MyThread2(Synchron p){
            s=p;
        }

        @Override
        public void run() {
            s.printThreads(2);
        }
    }
}


public class SynchronTest{
    public static void main(String[] args) {
        Synchron sync=new Synchron();
        Synchron.MyThread1 th1=new Synchron.MyThread1(sync);
        Synchron.MyThread2 th2 =new Synchron.MyThread2(sync);

        th1.start();
        th2.start();
    }
}
