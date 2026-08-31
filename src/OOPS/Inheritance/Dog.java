package OOPS.Inheritance;

public class Dog extends Animal {
    int age;
    String name;

    Dog(int age){
        super();
        this.age = age;
    }
    Dog(String name){
        super();
        this.name = name;
    }
    Dog(int age,String name){
        super();
        this.age= age;
        this.name= name;
    }

}
