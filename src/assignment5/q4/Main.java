package assignment5.q4;

class A{
    synchronized void m1(B b){
        System.out.println("Thread1 locked A");
        try{Thread.sleep(100);}catch(Exception e){}
        b.m2();
    }
    synchronized void m2(){
        System.out.println("Inside A m2");
    }
}
class B{
    synchronized void m1(A a){
        System.out.println("Thread2 locked B");
        try{Thread.sleep(100);}catch(Exception e){}
        a.m2();
    }
    synchronized void m2(){
        System.out.println("Inside B m2");
    }
}
public class Main{
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        new Thread(()->a.m1(b)).start();
        new Thread(()->b.m1(a)).start();
    }
}
