package OOPS;

public class LaptopDriver {
    public static void main (String[] args){
        Laptop1 l = new Laptop1();
        l.setId(201).setlBrand("HP");
        l.getB().setbId(101).setBrand("M2");
        System.out.println(l.getlId()); //201
        System.out.println(l.getlBrand()); //HP
        System.out.println(l.getB());  //OOPS.Battery@5caf905d
        System.out.println(l.getB().getbId()); //101
        System.out.println(l.getB().getBrand()); //M2


    }
}
