package assignment4.q2;

@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}


public class MethodReference {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Operation addoperation = calc::add;
        Operation suboperation = calc::subtract;
        Operation muloperation = Calculator::multiply;

        System.out.println(addoperation.apply(10, 5));
        System.out.println(suboperation.apply(10, 5));
        System.out.println(muloperation.apply(10, 5));
    }
}
