package OOPS.Inheritance;

public class Driver1 {
    public static void main(String[] args){
        System.out.println("Main Started");
        System.out.println(Parent.age);
        System.out.println("MAin ended");

    }
}
//Output:-
//Main Started
//Parent class is loading
//30
//MAin ended

//In the execution process if we try to access the parent class member with the help of parent class name outside the class only parent class will be loaded.
