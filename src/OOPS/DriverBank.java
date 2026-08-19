package OOPS;

public class DriverBank {
    public static void main(String[] args){
        Bank b1=new Bank();
        b1.setBankId(101);
        b1.setEmail("sbi@gmail.com");
        b1.setBalance(70000.0);

        Bank b2 = new Bank();
        b2.setBankId(201);
        b2.setEmail("hdfc@gmail.com");
        b2.setBalance(40000.0);

        System.out.println(b1.getBankId());  //101
        System.out.println(b1.getEmail(101));   //sbi@gmail.com
        System.out.println(b1.getBalance());  //70000.0

        System.out.println(b2.getBankId());  //102
        System.out.println(b2.getEmail(101));   //hdfc@gmail.com
        System.out.println(b2.getBalance());  //40000.0

    }
}
