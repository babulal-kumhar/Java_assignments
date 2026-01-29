package Assignment3.q2;

import java.util.*;

class Test{
    public static void main(String[]args){
        List<Employee> list=new ArrayList<>();

        list.add(new Employee("Babulal","Kumhar",25.0,50000.0));
        list.add(new Employee("Aditya","sharma",28.0,65000.0));
        list.add(new Employee("sourav","singh",30.0,45000.0));

        System.out.println("Default Sorting ");
        Collections.sort(list);
        for(Employee e:list)
            System.out.println(e);

        Comparator<Employee> salaryComparator=new Comparator<Employee>(){
            public int compare(Employee e1,Employee e2){
                return e1.salary.compareTo(e2.salary);
            }
        };

        System.out.println("\nSorting by Salary:");
        Collections.sort(list,salaryComparator);
        for(Employee e:list)
            System.out.println(e);
    }
}
