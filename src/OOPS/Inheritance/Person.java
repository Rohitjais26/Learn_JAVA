package OOPS.Inheritance;

public class Person {
    String name;
    int age;

    // Non-static Method
    public void eat(){
        System.out.println("Person is eating");
    }

    // Non-static Multi-Line Intitioner
    {
        System.out.println("Person class MLI");
    }

    // non-static Constructor
    Person(){
        System.out.println("Person class Constructor");
    }
}
