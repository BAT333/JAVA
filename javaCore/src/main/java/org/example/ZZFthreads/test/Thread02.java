package org.example.ZZFthreads.test;
class ThreadExampleRunnable2 implements Runnable{
    private String c;
    public ThreadExampleRunnable2(String c){
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i= 0; i<1000;i++){
            System.out.print(c);
            if (i%100==0) System.out.println();
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       // Thread.yield();
    }
}
public class Thread02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"),"NUMERO1");
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"),"NUMERO2");
        t1.start();
        t1.join();
        t2.start();



    }
}
