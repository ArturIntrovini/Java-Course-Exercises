public class Main {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        myAccount.accountInfo();
        System.out.println();

        myAccount.depositIntoAccount(200);
        System.out.println();
        myAccount.depositIntoAccount(-30);
        System.out.println();
        myAccount.withdrawFromAccount(50);
        System.out.println();
        myAccount.withdrawFromAccount(-5000);

    }

}
