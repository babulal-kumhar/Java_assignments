package assignment5.q8;

import java.util.concurrent.*;
import java.util.*;

class RandomTask implements Callable<Integer>{
    public Integer call(){
        return new Random().nextInt(100);
    }
}

public class Main{
    public static void main(String[] args)throws Exception{
        ExecutorService ex=Executors.newSingleThreadExecutor();

        Future<Integer> f=ex.submit(new RandomTask());

        Integer result=f.get();
        System.out.println("Random value="+result);

        ex.shutdown();
    }
}
