package OOPS.Inheritance.MultiLevel;

public class Dept extends College{
    int dId;
    String dName;

    Dept(int uId, String uName, int cId, String cName,int dId,String dName){
        super(uId,uName,cId,cName);
        this.dId = dId;
        this.dName = dName;
    }

    public void printDDetails(){
        printCDetails();
        System.out.println("Dept name:"+dName);
        System.out.println("Dept Id:"+dId);
    }
}
