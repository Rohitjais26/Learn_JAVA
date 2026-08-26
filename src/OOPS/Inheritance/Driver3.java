package OOPS.Inheritance;

public class Driver3 {
    public static void main(String[] args){
        System.out.println("Main Started");
        Son.drivingcar();
        System.out.println("Main ended");
    }
}

//Output:-
//  Main Started
//  Father Class is loading
//  Son class is  loading
//  Son is Driving Car
//  Main ended

//In the execution process if we are try to acess the child class static member using child class name outside the class
//first parent class will be loaded then child class will be loaded.