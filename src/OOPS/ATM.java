package OOPS;

public class ATM {
    private double money;
    private String bankname;

    //Getter
    public double getMoney(){
        return this.money;
    }

    //Setter
    public void setMoney(double money){
        this.money = money;
    }

    //Getter
    public String getBankname() {
        return bankname;
    }

    //Setter
    public void setBankname(String bankname){
        this.bankname = bankname;
    }
}
