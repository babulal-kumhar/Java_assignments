package Assignment2.q5;

class Singleton{
    private static Singleton instance;
    private Singleton(){
    }
    static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    void showMessage(){
        System.out.println("Singleton instance accessed");
    }
}
public class SingletonUse{
    public static void main(String[]args){
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();

        s1.showMessage();
        if(s1==s2)
            System.out.println("Both references point to same object");
    }
}
