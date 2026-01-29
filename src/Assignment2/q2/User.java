package Assignment2.q2;

class User{
    String firstname;
    String lastname;
    int age;
    String phonenumber;

    User(String firstname,String lastname,int age,String phonenumber){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.phonenumber=phonenumber;
    }

    public String toString(){
        return firstname+","+lastname+","+age+","+phonenumber;
    }
}
