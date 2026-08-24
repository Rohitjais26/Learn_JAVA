package OOPS;

public class LaptopDriver {
    public static void main (String[] args){
        Laptop1 l = new Laptop1();
        l.setId(201).setlBrand("HP");
        l.getB().setbId(101).setBrand("M2");
        System.out.println(l.getlId());
        System.out.println(l.getlBrand());
        System.out.println(l.getB());
        System.out.println(l.getB().getbId());
        System.out.println(l.getB().getBrand());


    }
}
