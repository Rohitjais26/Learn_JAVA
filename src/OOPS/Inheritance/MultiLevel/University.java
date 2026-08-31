package OOPS.Inheritance.MultiLevel;

public class University {
    int uId;
    String uName;

    University(int uId,String uName){
        this.uId = uId;
        this.uName = uName;
    }
    public void printUDetails(){
        System.out.println("University name:"+uName);
        System.out.println("University Id :"+uId);
    }
}
