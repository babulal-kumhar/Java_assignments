package assignment4.q4;

@FunctionalInterface
interface StudentFactory {
    Student create(String name, int age);
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}


    public class ConstructorReference{
        public static void main(String[] args) {

            StudentFactory sf = Student::new;

            Student s1 = sf.create("Babulal", 20);
            s1.display();
        }
    }


