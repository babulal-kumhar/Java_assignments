package assignment4.q1;

@FunctionalInterface
interface Greater {
    boolean check(int a, int b);
}

@FunctionalInterface
interface Increment {
    int inc(int a);
}

@FunctionalInterface
interface Concat {
    String join(String a, String b);
}

@FunctionalInterface
interface Upper {
    String convert(String s);
}

public class LambdaUse {
    public static void main(String[] args) {

        Greater g = (a, b) -> a > b;
        Increment i = a -> a + 1;
        Concat c = (a, b) -> a + b;
        Upper u = s -> s.toUpperCase();

        System.out.println(g.check(10, 5));
        System.out.println(i.inc(7));
        System.out.println(c.join("Hello ", "Java"));
        System.out.println(u.convert("lambda"));
    }
}
