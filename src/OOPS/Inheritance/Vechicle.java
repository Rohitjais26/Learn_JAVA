package OOPS.Inheritance;

public class Vechicle {
    String type;
    int no;

    {
        System.out.println("Vechile is loading");
    }
    public Vechicle(String type,int no){
        this.type = type;
        this.no = no;
    }

    public Vechicle() {
    }
}
