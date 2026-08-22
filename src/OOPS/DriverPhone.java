package OOPS;

public class DriverPhone {
    public static void main(String[] args){

        Phone p = Phone.createPhone();
        p.setID(101);
        p.setBrand("Samansung");
        p.setPrice(900000.0);

        System.out.println(p.getID());//101
        System.out.println(p.getBrand());//Samsung
        System.out.println(p.getPrice());//900000.0

    }
}


//Factory Method is a process of creating an method throught which we call and return the object is called as Factory Method.