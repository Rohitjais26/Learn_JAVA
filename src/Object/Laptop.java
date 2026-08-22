package Object;

public class Laptop {
    int id = 101;
    String brand = "iphone";
    double price;

    //non-static method
    public void coding(){
        System.out.println("Laptop is coding");
    }
    //Non-static block
    {
        System.out.println("Laptop object loading process");
    }
    //Constructor
    Laptop(){
        System.out.println("Laptop Constructor");
    }

    public static void main(String[] args){
        Laptop l = new Laptop();
        System.out.println(l.id);
        System.out.println(l.brand);
        System.out.println(l.price);

        l.coding();
    }
}
