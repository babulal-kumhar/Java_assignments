package assignment4.q9;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String fullName;
    Long salary;
    String city;
    Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}

public class StreamUsage {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Babulal Kumhar",4000L,"Delhi"),
                new Employee("Dhawal Kumar Verma",3000L,"Delhi"),
                new Employee("Adityaa Sharma",6000L,"Delhi"),
                new Employee("Jai Gupta",3500L,"Mumbai"),
                new Employee("Sourab Singh",4500L,"Delhi")
        );

        List<String> firstNames = employees.stream()
                .filter(e ->e.salary<5000)
                .filter(e -> e.city.equalsIgnoreCase("Delhi"))
                .map(e -> e.fullName.split(" ")[0])
                .distinct()
                .collect(Collectors.toList());
        System.out.println(firstNames);
    }
}
