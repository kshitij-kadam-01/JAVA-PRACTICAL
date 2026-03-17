class Person{
	int age=11;
	Person(){
		System.out.println("this is parent class");
	}

}
class Student extends Person {
    int id;

    Student() {
     
            this.id = id;  
		System.out.println(id);

    }         
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
           }
}