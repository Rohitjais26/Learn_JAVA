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

//Object is a block of memory in which there are multiple variables and methods which stores data in it.
//Object have unique address
//eg:- Laptop l = new Laptop()
// new is a keyword which is use to create a block of memory in leap area.
// Reference variable(l) is use to store the address of the object.

// Constructor is a non-static member which is name as classname and use to store and intialize the object.
//eg:- Laptop(){
//               }

