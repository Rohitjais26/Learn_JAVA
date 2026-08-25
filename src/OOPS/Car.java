package OOPS;

public class Car {
    int cId;
    String cBrand;
    //has-a-relationship
    Radio radio;

    public Car(int cId,String cBrand){
        this.cId = cId;
        this.cBrand = cBrand;
    }
    //Lazy instantiation

}
