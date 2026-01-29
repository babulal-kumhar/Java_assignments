package assignment1.q5;

class Employee{
    String firstname;
    String lastname;
    int age;
    String designation;

    Employee(){
    }
    Employee(String firstname,String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
    }
    Employee(String firstname,String lastname,int age,String designation){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.designation=designation;
    }
    void setFirstname(String firstname){
        this.firstname=firstname;
    }
    void setLastname(String lastname){
        this.lastname=lastname;
    }
    void setAge(int age){
        this.age=age;
    }
    void setDesignation(String designation){
        this.designation=designation;
    }
    public String toString(){
        return "Employee "+firstname+" "+lastname+" is "+age+" years old and works as "+designation;
    }
    public static void main(String[]args){
        Employee emp=new Employee("Babulal","Kumhar",20,"Developer");
        System.out.println(emp);
    }
}
