package org.example.ZZFthreads;

import org.example.ZZFthreads.Dominio.Account;

public class DealockTest {

    public static void main(String[] args) {
        Object lock2 = new Object();
        Object lock1 = new Object();
Runnable runnable = () -> {

    synchronized (lock1){
        System.out.println("T1 segurando T1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("T1 esperando T2");
    }

    synchronized (lock2){
        System.out.println("T1 segurando T2");

    }
};

        Runnable runnable2 = () -> {

            synchronized (lock1){
                System.out.println("T1 segurando T1");
                System.out.println("T1 esperando T2");
            }

            synchronized (lock2){
                System.out.println("T1 segurando T2");
            }
        };
        new Thread(runnable).start();
        new Thread(runnable2).start();

    }
}
