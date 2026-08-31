package OOPS.Inheritance.MultiLevel;

public class College extends University{
    int cId;
    String cName;

    College(int uId, String uName, int cId, String cName){
        super(uId,uName);
        this.cId = cId;
        this.cName = cName;
    }

    public void printCDetails(){
        printUDetails();
        System.out.println("College name:"+cName);
        System.out.println("College Id:"+cId);
    }
}
