package OOPS;

public class Phone {
    private int ID;
    private String brand;
    private double price;

    public static Phone createPhone(){
        return new Phone();
    }
    public int getID(){
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand= brand;
    }
    public double getPrice(){
        return price;

    }

    public void setPrice(double price) {
        this.price = price;
    }
}
