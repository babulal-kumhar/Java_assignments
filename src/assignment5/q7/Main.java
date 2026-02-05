package assignment5.q7;

import java.util.*;
import java.util.concurrent.*;

class Task implements Callable<String>{
    int id;
    Task(int id){
        this.id=id;
    }
    public String call()throws Exception{
        Thread.sleep(500);
        return Thread.currentThread().getName()+" task "+id;
    }
}
public class Main{
    static void runExecutor(ExecutorService ex)throws Exception{
        List<Callable<String>> tasks=new ArrayList<>();
        for(int i=1;i<=5;i++){
            tasks.add(new Task(i));
        }
        List<Future<String>> results=ex.invokeAll(tasks);
        for(Future<String> f:results){
            System.out.println(f.get());
        }
        ex.shutdown();
        ex.awaitTermination(1,TimeUnit.MINUTES);
        System.out.println("done");
    }
    public static void main(String[] args)throws Exception{
        runExecutor(Executors.newSingleThreadExecutor());
        runExecutor(Executors.newFixedThreadPool(3));
        runExecutor(Executors.newCachedThreadPool());
    }
}
