package OOPS.Inheritance;

public class Car extends Vechicle{
    double price;
    String color;

    {
        System.out.println("Car is loading");
    }
    Car(String type,int no, double price,String color){
        super(type,no);
        this.type= type;
        this.no=no;
    }

}
