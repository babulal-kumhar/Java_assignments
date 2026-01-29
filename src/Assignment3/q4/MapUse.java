package Assignment3.q4;

import java.util.HashMap;
import java.util.Map;

class MapUse
{
    public static void main(String[]args){
        Map<Employee,Double> map=new HashMap<>();

        Employee e1=new Employee("Babulal",25,"Developer");
        Employee e2=new Employee("Dhawal",30,"Tester");
        Employee e3=new Employee("aditya",28,"Manager");

        map.put(e1,50000.0);
        map.put(e2,45000.0);
        map.put(e3,70000.0);

        for(Map.Entry<Employee,Double> entry:map.entrySet()){
            System.out.println(entry.getKey()+" Salary:"+entry.getValue());
        }
    }
}
