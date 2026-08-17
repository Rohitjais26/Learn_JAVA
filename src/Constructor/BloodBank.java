package Constructor;

public class BloodBank {
    int id;
    String BloodGroup;
    String location;

    BloodBank(){
        System.out.println("Constructor 1");
    }
    BloodBank(int id){
        this.id = id;
        System.out.println("Constructor 2");
    }
    BloodBank(String BloodGroup){
        this.BloodGroup = BloodGroup;
        System.out.println("Constructor 3");
    }
    BloodBank(String BloodGroup,String location){
        System.out.println("Constructor 4");
    }
    BloodBank(int id,String BloodGroup,String location){
        System.out.println("Constructor 3");
    }

    public static void main(String[] args){
        BloodBank b = new BloodBank();
        BloodBank b1 = new BloodBank(101);
        BloodBank b2 = new BloodBank("AB-","New panvel");
        BloodBank b3 = new BloodBank("O","mumbai");
        BloodBank b4 = new BloodBank(103,"AB","Parel");

        System.out.println(b1.id);
        System.out.println(b2.BloodGroup);
    }

}
