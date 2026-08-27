package OOPS.Inheritance;

public class EmployeeDriver {
    public static void main(String[] args){
        Employee e = new Employee();
        e.name = "smith";
        System.out.println(e.name);
        System.out.println(e.age);
        System.out.println(e.id);
        System.out.println(e.salary);
        e.working();
        e.eat();
    }
}
