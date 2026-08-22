package OOPS;

public class DriverPhone {
    public static void main(String[] args){

        Phone p = Phone.createPhone();
        p.setID(101);
        p.setBrand("Samansung");
        p.setPrice(900000.0);

        System.out.println(p.getID());
        System.out.println(p.getBrand());
        System.out.println(p.getPrice());

    }
}
