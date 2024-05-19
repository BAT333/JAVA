package org.example.ZZFthreads.Dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }
    public int pendingEmail(){
        synchronized (emails){
            return emails.size();
        }
    }
    public void addMemberEmail(String email){

        synchronized (this.emails){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+ " add email na list");
            this.emails.add(email);
            //todo volta quando a thread esperando
            this.emails.notifyAll();

        }
    }
    public String retriverEmail(){
        System.out.println(Thread.currentThread().getName()+ " VENDO EMAILS");
        synchronized (this.emails){
            while (this.emails.size() == 0){
                if(!open)return null;
                System.out.println(Thread.currentThread().getName()+" não tem email");
                try {
                   this.emails.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            return emails.poll();

        }
    }
    public void close(){
        open = false;
        synchronized (this.emails){
            System.out.println(Thread.currentThread().getName()+ " NOTIFICANDO TODO MUNDO QUE THREAD TA FECHANDO");
        }
    }
}
