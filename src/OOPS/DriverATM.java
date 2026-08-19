package OOPS;

public class DriverATM {
    public static void main(String[] args){
        ATM a1 = new ATM();
        System.out.println(a1.getMoney());
        a1.setMoney(90000.0);
        System.out.println(a1.getMoney());
        a1.setMoney(80000.0);
        System.out.println(a1.getBankname());
        a1.setBankname("SBI");
        System.out.println(a1.getBankname());

        //Creating Another Object
        ATM a2 = new ATM();
        System.out.println(a2.getMoney());
        a2.setMoney(65600.0);
        System.out.println(a2.getMoney());



    }
}
