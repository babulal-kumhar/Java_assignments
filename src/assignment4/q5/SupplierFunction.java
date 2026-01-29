package assignment4.q5;

import java.util.function.Supplier;

public class SupplierFunction {
    public static void main(String[] args) {

        Supplier<Integer> s = () ->100;
        System.out.println(s.get());
    }
}
