package assignment4.q5;

import java.util.function.Function;

public class FunctionUsed{
    public static void main(String[] args) {
        Function<String, Integer> f=s -> s.length();
        System.out.println(f.apply("Lambda"));
    }
}
