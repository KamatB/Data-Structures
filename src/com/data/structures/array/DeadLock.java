package com.data.structures.array;

public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
         Shared s1 = new Shared();
        Shared s2 = new Shared();

        Shared.MyThreadDead1 t1 = s1.new MyThreadDead1(s1, s2);
        Shared.MyThreadDead2 t2 = s2.new MyThreadDead2(s1, s2);
        t1.setName("Thread 1");
        t1.start();
        t2.setName("Thread 2");
        t2.start();Thread.sleep(2000);
    }
}

class Shared{
    synchronized public void test1(Shared s2) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " thread name"+this);
        s2.test2();
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " thread name"+this);
    }

    synchronized public void test2() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " thread name"+this);
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " thread name"+this);
    }

    class MyThreadDead1 extends Thread{
        Shared s1;
        Shared s2;
        MyThreadDead1(Shared p1,Shared p2){
            s1=p1;
            s2=p2;
        }
        @Override
        public void run() {
            try {
                s1.test1(s2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    class MyThreadDead2 extends Thread{
        Shared s1;
        Shared s2;
        MyThreadDead2(Shared p1,Shared p2){
            s1=p1;
            s2=p2;
        }
        @Override
        public void run() {
            try {
                s2.test1(s1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
