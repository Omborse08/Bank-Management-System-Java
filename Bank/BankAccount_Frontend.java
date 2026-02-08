package Bank;

import java.util.Scanner;

public class BankAccount_Frontend {
    static void showCreateMenu() {
        System.out.println("1.Create Customer\n2.Use Bank Account\n3.Exit");
    }
    static void showBalanceMenu() {
        System.out.println("\n1.View Balance\n2.Withdraw Balance\n3.Deposite Balance\n4.Exit");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countingId = 1;
        BankAccountManager BAM = new BankAccountManager();
        showCreateMenu();
        boolean isBankOn = true;
        while (isBankOn) {
            System.out.print("Choose Option: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Customer PinCode: ");
                    int pin = sc.nextInt();
                    BankAccount bankAccount = new BankAccount(name,pin,countingId++);
                    if (BAM.addAccount(bankAccount)) {
                        System.out.println("Account Created Successfully!");
                        System.out.println("Account Id: "+bankAccount.getId());
                        System.out.println("Account Balance: "+bankAccount.getBalance());
                    }
                    else {
                        System.out.println("No Account Added!");
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter Customer Id: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Customer Pin: ");
                    int pincode = sc.nextInt();
                    BankAccount bank = BAM.findAccountByIdAndPincode(id,pincode);
                    if (bank != null) {
                        System.out.print("Welcome "+bank.getName()+" To SBI");
                        boolean isCheckingBalance = true;
                        while (isCheckingBalance) {
                            showBalanceMenu();
                            System.out.print("Choose Option: ");
                            int chooseAgain = sc.nextInt();
                            switch (chooseAgain) {
                                case 1:
                                    System.out.println("Account Holder Name: "+bank.getName());
                                    System.out.println("Account Holder Balance: "+bank.getBalance());
                                    break;
                                case 2:
                                    System.out.println(" <=====> Withdraw Balance <=====> ");
                                    System.out.print("Enter Amount To Withdraw: ");
                                    int withdrawAmount = sc.nextInt();
                                    if (bank.withdrawBalance(withdrawAmount)) {
                                        System.out.println("New Balance: "+bank.getBalance());
                                    }
                                    else {
                                        System.out.println("Withdraw Amount Is Greater Than Balance!");
                                    }
                                    break;
                                case 3:
                                    System.out.println(" <=====> Deposite Balance <=====> ");
                                    System.out.print("Enter Amount To Deposite: ");
                                    int depositAmount = sc.nextInt();
                                    if (bank.depositeBalance(depositAmount)) {
                                        System.out.println("New Balance: "+bank.getBalance());
                                    }
                                    else {
                                        System.out.println("Deposite Amount Is Invalid!");
                                    }
                                    break;
                                case 4:
                                    System.out.println("> Your Transaction is Completed Mr/Mrs."+bank.getName());
                                    isCheckingBalance = false;
                                    break;

                            }
                        }
                    }
                    else {
                        System.out.print("No Account With This Pincode and Id Registered!");
                    }
                    break;
                case 3:
                    System.out.println("Thank You For Using Our Bank!");
                    isBankOn = false;
                    break;
            }
        }
        sc.close();
    }
}
