package OOPS.Inheritance.SingleLevel;

public class Person {
    int age;
    String name;

    Person(int age,String name){
        this.age = age;
        this.name = name;
    }
    public void printPersonDetails(){
        System.out.println("Person name :"+ name);
        System.out.println("Person age :"+ age);

    }
}
