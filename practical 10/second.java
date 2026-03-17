//constructor calling preference
class Person {
    Person() {
        System.out.println("person first");
    }
}

class Student extends Person {
    Student() {
        System.out.println("student first");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}