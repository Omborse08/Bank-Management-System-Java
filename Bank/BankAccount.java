package Bank;
class BankAccount{
    private String name;
    private int id;
    private int balance;
    private int pincode;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public int getPincode() {
        return pincode;
    }

    public BankAccount(String name,int pincode,int id) {
        this.name = name;
        this.pincode = pincode;
        this.id = id;
        this.balance = 0;
    }

    public boolean withdrawBalance(int withdraw) {
        boolean isWithdrawed = false;
        if (withdraw <= balance && withdraw > 0) {
            this.balance -= withdraw;
            isWithdrawed = true;
        }
        return isWithdrawed;
    }

    public boolean depositeBalance(int deposite) {
        boolean isDeposite = false;
        if (deposite > 0) {
            this.balance += deposite;
            isDeposite = true;
        }
        return isDeposite;
    }
}
