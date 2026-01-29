package assignment4.q5;

import java.util.function.Consumer;

public class ConsumerFunction{
    public static void main(String[] args){
        Consumer<String> c =s ->System.out.println("Hello " +s);
        c.accept("Babulal");
    }
}
