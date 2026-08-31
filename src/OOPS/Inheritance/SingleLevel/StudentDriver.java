package OOPS.Inheritance.SingleLevel;

public class StudentDriver {
    public static void main(String[] args){
        Student s = new Student(18,"Rohit",201,95.5);
        s.printPersonDetails();
        s.printStudentDetails();
    }
}

// Here We can see that Person class is Parent class and Student class is Child class.