package assignment5.q5;

import java.util.concurrent.*;
class MyCallable implements Callable<Integer>{
    public Integer call()throws Exception{
        int sum=0;
        for(int i=1;i<=5;i++){
            sum+=i;
        }
        return sum;
    }
}
class MyRunnable implements Runnable{
    public void run(){
        int sum=0;
        for(int i=1;i<=5;i++){
            sum+=i;
        }
        System.out.println("Runnable sum="+sum);
    }
}
public class Main{
    public static void main(String[] args)throws Exception{
        ExecutorService ex=Executors.newSingleThreadExecutor();

        Future<Integer> f=ex.submit(new MyCallable());
        ex.submit(new MyRunnable());

        System.out.println("Callable result="+f.get());

        ex.shutdown();
    }
}
