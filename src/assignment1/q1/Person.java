package assignment1.q1;

class Person{
    static String firstName="Babulal";
    static String lastName="Kumhar";
    static int age=20;

    static{
        System.out.println("FirstName:"+firstName);
    }

    static void printLastName(){
        System.out.println("LastName:"+lastName);
    }

    static int AGE=age;

    public static void main(String[]args){
        printLastName();
        System.out.println("Age:"+AGE);
    }
}

