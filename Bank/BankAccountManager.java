package Bank;

public class BankAccountManager {
    private int count = 0;
    BankAccount [] bankaccounts = new BankAccount[10];

    public boolean addAccount(BankAccount banksaccount) {
        boolean isAdded = false;
        if (banksaccount != null && count < bankaccounts.length) {
            bankaccounts[count] = banksaccount;
            count++;
            isAdded = true;
        }
        return isAdded;
    }

    public BankAccount findAccountByIdAndPincode(int id,int pincode) {
        for (int i=0;i<count;i++) {
            if (bankaccounts[i].getId() == id && bankaccounts[i].getPincode() == pincode) {
                return bankaccounts[i];
            }
        }
        return null;
    }
}
