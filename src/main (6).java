package Bank;

public class main {

	public static void main(String[] args) {
        BankAccount acct1 = new BankAccount(3000,-1000);
        System.out.println(acct1.getBalance());
        System.out.println("balance=" + acct1.getBalance());

}
}