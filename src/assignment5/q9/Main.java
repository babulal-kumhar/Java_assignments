package assignment5.q9;

import java.util.concurrent.*;

class Task implements Runnable{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" working "+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(Thread.currentThread().getName()+" interrupted");
        }
    }
}
public class Main{
    public static void main(String[] args)throws Exception{
        ExecutorService ex1=Executors.newFixedThreadPool(2);
        ExecutorService ex2=Executors.newFixedThreadPool(2);
        ex1.submit(new Task());
        ex1.submit(new Task());
        ex2.submit(new Task());
        ex2.submit(new Task());
        Thread.sleep(2000);
        ex1.shutdown();
        ex2.shutdownNow();
    }
}
