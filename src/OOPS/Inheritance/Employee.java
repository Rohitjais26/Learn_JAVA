package OOPS.Inheritance;

public class Employee extends Person {
    int id;
    double salary;

    public static void working(){
        System.out.println("Employee ");
    }
    {
        System.out.println("Employee Class MlI");
    }
    Employee(){
        System.out.println("Employee Class Object Loading");
    }
}
