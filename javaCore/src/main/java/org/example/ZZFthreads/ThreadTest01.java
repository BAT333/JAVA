package org.example.ZZFthreads;

class ThreadExample extends Thread{
    private char c;
    public ThreadExample(char c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i= 0; i<1000;i++){
            System.out.print(c);
            if (i%100==0) System.out.println();
        }
    }
}
class ThreadExampleRunnable implements Runnable{
    private char c;
    public ThreadExampleRunnable(char c){
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
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
     /*   ThreadExample t = new ThreadExample('A');
        ThreadExample t1 = new ThreadExample('b');
        ThreadExample t2 = new ThreadExample('c');
        ThreadExample threadExample3 = new ThreadExample('d');
        ThreadExample threadExample4 = new ThreadExample('f');
        ThreadExample threadExample5 = new ThreadExample('k');

      */
        Thread t = new Thread(new ThreadExampleRunnable('A'),"NUMERO1");
        t.setPriority(10);
        Thread t1 = new Thread( new ThreadExampleRunnable('b'),"NUMERO2");
        t1.setPriority(8);
        Thread t2 = new Thread( new ThreadExampleRunnable('c'));
        t2.setPriority(6);
        Thread threadExampleRunnable3 =  new Thread(new ThreadExampleRunnable('d'));
        threadExampleRunnable3.setPriority(4);
        Thread threadExampleRunnable4 =  new Thread(new ThreadExampleRunnable('f'));
        threadExampleRunnable4.setPriority(2);
        Thread threadExampleRunnable5 = new Thread( new ThreadExampleRunnable('k'));
        threadExampleRunnable5.setPriority(1);
        t.start();
        t1.start();
        t2.start();
        threadExampleRunnable3.start();
        threadExampleRunnable4.start();
        threadExampleRunnable5.start();


    }
}
