package assignment5.q1;

class Task implements Runnable{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(getName()+" "+i);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}

public class Main{
    public static void main(String[] args)throws Exception{
        Thread t1=new Thread(new Task(),"RunnableThread");
        MyThread t2=new MyThread();
        t2.setName("ThreadClass");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main thread ends");
    }
}
