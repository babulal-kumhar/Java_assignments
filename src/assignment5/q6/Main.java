package assignment5.q6;

import java.util.concurrent.locks.ReentrantLock;

class Resource{
    ReentrantLock lock=new ReentrantLock();
    void use(String name){
        System.out.println(name+" using resource");
    }
}

class Task implements Runnable{
    Resource r1;
    Resource r2;
    Task(Resource r1,Resource r2){
        this.r1=r1;
        this.r2=r2;
    }
    public void run(){
        boolean done=false;
        while(!done){
            if(r1.lock.tryLock()){
                try{
                    Thread.sleep(50);
                    if(r2.lock.tryLock()){
                        try{
                            r1.use(Thread.currentThread().getName());
                            r2.use(Thread.currentThread().getName());
                            done=true;
                        }finally{
                            r2.lock.unlock();
                        }
                    }
                }catch(Exception e){}
                finally{
                    r1.lock.unlock();
                }
            }
            try{Thread.sleep(10);}catch(Exception e){}
        }
    }
}

public class Main{
    public static void main(String[] args){
        Resource r1=new Resource();
        Resource r2=new Resource();

        new Thread(new Task(r1,r2),"T1").start();
        new Thread(new Task(r2,r1),"T2").start();
    }
}
