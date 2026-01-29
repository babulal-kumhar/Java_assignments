package assignment4.q6;

interface MyInterface{
    default void show(){
        System.out.println("Default method of interface");
    }
    static void display(){
        System.out.println("Static method of interface");
    }
}

class Demo implements MyInterface {

}

public class InterfaceAcces{
    public static void main(String[] args) {

        Demo d =new Demo();
        d.show();
        MyInterface.display();
    }
}
