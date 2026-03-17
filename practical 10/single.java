//single inheritance
class Person{
          static int age=10;
           Person(){
                     
                          System.out.println("myage is ");
          }

}
class Student extends Person{
           int regno=262;
           void myregno(){
                    System.out.println("my registration number is :"+regno);
           }

}
public void main(String[] args){
         Person rahul= new Person();
         System.out.println(rahul.age);
}