public class BankAccount {

    private String name = "Artur";

    private String email = "artur@mail.com";

    private int accountNumber = 546213;

    private int phoneNumber = 555789456;

    private double accountBalance = 1000;

    public void accountInfo() {
        System.out.println("Account holder: " + name);
        System.out.println("Account email: " + email);
        System.out.println("Account phone: " + phoneNumber);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account balance: $" + accountBalance);
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void depositIntoAccount (double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount requested.");
            return;
        }
        System.out.println("You are trying to deposit $" + amount + " into your account. Your current balance is: $" + accountBalance + ".");
        accountBalance = accountBalance + amount;
        System.out.println("Deposit successful, your new balance is: $" + accountBalance + ".");

    }

    public void withdrawFromAccount (double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount requested.");
            return;
        }
        System.out.println("You are trying to withdraw $" + amount + " from your account. Your current balance is: $" + accountBalance + ".");
        if (amount > accountBalance) {
            System.out.println("Not enough balance for the requested amount, please request an amount within your current balance.");
        } else {
            accountBalance = accountBalance - amount;
            System.out.println("Withdrawal successful. Your new balance is: $" + accountBalance + ".");
        }
    }

}
