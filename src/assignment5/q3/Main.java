package assignment5.q3;

class SharedData{
    volatile boolean running=true;
}
class Worker extends Thread{
    SharedData d;
    Worker(SharedData d){
        this.d=d;
    }
    public void run(){
        while(d.running){
        }
        System.out.println("Worker stopped");
    }
}
public class Main{
    public static void main(String[] args)throws Exception{
        SharedData d=new SharedData();
        Worker t=new Worker(d);
        t.start();
        Thread.sleep(2000);
        d.running=false;
        System.out.println("Main stopped worker");
    }
}
