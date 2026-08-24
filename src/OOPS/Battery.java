package OOPS;

public class Battery {
    private int bId;
    private String brand;

    public int getbId(){
        return bId;
    }
    public Battery setbId(int bId){
        this.bId = bId;
        return this;
    }
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
