//multilevel inheritance

class Person {
    void showPerson() {
        System.out.println("Class Person");
    }
}

class Student extends Person {
    void showStudent() {
        System.out.println("Class Student");
    }
}

class Child extends Student {
    void showChild() {
        System.out.println("Class Child");
    }
}

class Main {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.showPerson();
        obj.showStudent();
        obj.showChild();
    }
}