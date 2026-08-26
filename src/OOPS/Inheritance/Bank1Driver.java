package OOPS.Inheritance;

public class Bank1Driver {
    public static void main(String[] args){
        // Accessing Static member using Classname outside the Class
        System.out.println(Bank1.id);
        System.out.println(Bank1.Bankname);
        Bank1.printDetail();

        //Accessing the Static member using Object ref variable
        Bank1 b = new Bank1();
        System.out.println(b.id);
        System.out.println(b.Bankname);

    }


}
