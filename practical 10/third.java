//method over ridding
 class Person{
		Person(){
			System.out.println("person first");
	}
		void myAge(){
			System.out.println("from Person class");
		}
}
class Student extends Person{
		Student(){
			System.out.println("student first");
	}
                void myAge(){

			System.out.println("from Student class");
		}

public static void main(String[] args){
		Student s1=new Student();
		s1.myAge();
  }
}
