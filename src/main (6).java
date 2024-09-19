package Bank;

public class main {

	public static void main(String[] args) {
        BankAccount acct1 = new BankAccount(3000, -1000);
        boolean success = acct1.withdraw(1500);
        System.out.println("success=" + success + ", balance=" + acct1.getBalance());
        acct1.deposit(500);
        System.out.println("balance=" + acct1.getBalance());
        System.out.println(acct1);
        BankAccount acct2 = new BankAccount(3000, -1000);
        boolean successs = acct1.transfer(acct2, 500);
        System.out.println("transfer success = " + successs);


	}
}
