package OOPS.Inheritance.SingleLevel;

public class Student extends Person{
    int sId;
    double marks;

    Student(int age, String name, int sId, double marks){
        super(age,name);
        this.sId= sId;
        this.marks = marks;

    }
    public void printStudentDetails(){
        printPersonDetails();
        System.out.println("Student id:"+ sId);
        System.out.println("Student marks :"+ marks);

    }
}
