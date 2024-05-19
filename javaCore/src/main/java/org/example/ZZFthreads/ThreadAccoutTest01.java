package org.example.ZZFthreads;

import org.example.ZZFthreads.Dominio.Account;

public class ThreadAccoutTest01 implements Runnable{
    private  Account account = new Account();
    public static void main(String[] args) {

        ThreadAccoutTest01 t1 = new ThreadAccoutTest01();
        Thread thread = new Thread(t1,"RIAN");
        Thread thread2 = new Thread(t1,"RAFAEL");
        thread2.start();
        thread.start();

    }
    private synchronized void withDrawal(int amount){
        if(account.getBalance()>=amount){
            System.out.println( getName() +" ESTA INDO SACAR DINHEIRO");
            account.withDrawal(amount);
            System.out.println( getName() +" COMPLETOU SAQUE DINHEIRO ATUAL "+ account.getBalance());
        }else {
            System.out.println("SEM DINHEIRO PARA SACAR "+ getName());
        }

    }

    private String getName() {
        return Thread.currentThread().getName();
    }

    @Override
    public void run() {
        for (int i= 0; i<5;i++){
            withDrawal(10);
            if(account.getBalance()<0){
                System.out.println("Sem grana");
            }
        }
    }
}
