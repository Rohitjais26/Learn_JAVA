package OOPS;

public class Bank {
    private int bankId;
    private String email;
    private double balance;

    public int getBankId(){
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    //Verification
    public String getEmail(int bankId){
        if(this.bankId == bankId)
            return email;
        else return ("Enter the valid email");

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance(){
        return balance;
    }

    //validation
    public void setBalance(double balance){
        if (balance>= 0)
            this.balance= balance;

    }
}
