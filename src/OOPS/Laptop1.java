package OOPS;

public class Laptop1 {
    private int lId;
    private String lBrand;
    //has-a-relationship
    private Battery b = new Battery();

    public int getlId() {
        return lId;
    }
    public Laptop1 setId(int lId){
        this.lId= lId;
        return this;
    }

    public String getlBrand() {
        return lBrand;
    }

    public Laptop1 setlBrand(String lBrand) {
        this.lBrand = lBrand;
        return this;
    }

    public Battery getB() {
        return b;
    }
}
