package OOPS.Inheritance;

public class Driver2 {
    public static void main(String[] args){
        System.out.println("Main Started");
        System.out.println(Child.age);
        System.out.println("Main Ended");
    }
}

// In the execution process if we are trying to access the parent class static member outside the class
//with the help of child class name only parent class will be loaded.
