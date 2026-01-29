package Assignment3.q2;

class Employee implements Comparable<Employee>{
    String firstname;
    String lastname;
    Double age;
    Double salary;

    Employee(String firstname,String lastname,Double age,Double salary){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.salary=salary;
    }

    public int compareTo(Employee e){
        int firstCompare=this.firstname.compareTo(e.firstname);
        if(firstCompare!=0)
            return firstCompare;
        return this.lastname.compareTo(e.lastname);
    }

    public String toString(){
        return firstname+" "+lastname+" | Age:"+age+" | Salary:"+salary;
    }
}
