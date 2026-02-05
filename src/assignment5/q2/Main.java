package assignment5.q2;

class Counter{
    private int count=0;

    synchronized void incrementMethod(){
        count++;
        System.out.println(Thread.currentThread().getName()+" count="+count);
    }
    void incrementBlock(){
        synchronized(this){
            count++;
            System.out.println(Thread.currentThread().getName()+" count="+count);
        }
    }
}
class Task implements Runnable{
    Counter c;
    Task(Counter c){
        this.c=c;
    }
    public void run(){
        for(int i=0;i<3;i++){
            c.incrementMethod();
            c.incrementBlock();
        }
    }
}
public class Main{
    public static void main(String[] args)throws Exception{
        Counter c=new Counter();

        Thread t1=new Thread(new Task(c),"T1");
        Thread t2=new Thread(new Task(c),"T2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
