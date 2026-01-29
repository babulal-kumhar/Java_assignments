package assignment4.q3;


interface A {
    default void show() {
        System.out.println("Show from interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Show from interface B");
    }
}

class Inherited implements A, B {

    @Override
    public void show() {
        A.super.show();
        B.super.show();
        System.out.println("Show from Inherited class");
    }
}

public class MultipleInheritanceDefault {
        public static void main(String[] args) {
            Inherited d = new Inherited();
            d.show();
        }
}
