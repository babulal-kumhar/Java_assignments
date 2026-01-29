package Assignment3.q4;

class Employee{
    String name;
    int age;
    String designation;

    Employee(String name,int age,String designation){
        this.name=name;
        this.age=age;
        this.designation=designation;
    }

    public boolean equals(Object o){
        if(this==o)
            return true;
        if(o==null||getClass()!=o.getClass())
            return false;

        Employee e=(Employee)o;
        return age==e.age &&
                name.equals(e.name) &&
                designation.equals(e.designation);
    }

    public int hashCode(){
        return name.hashCode()+age+designation.hashCode();
    }

    public String toString(){
        return name+" ("+designation+", "+age+")";
    }
}
