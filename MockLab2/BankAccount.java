import javax.swing.JOptionPane;
import java.util.Date;

class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}

	public void setId(int newId) {
		id = newId;
	}

	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	public static void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}
}

public class BankAccount {
	public static void main(String [] args)
	{
		String wDraw;
    	double w;

		Account account1 = new Account();
		Account.setAnnualInterestRate(4.5); //account->account1, need to fill the ()!!!!
		wDraw = JOptionPane.showInputDialog("Amount to withdraw (MYR)"); // msg -> input
		w = Double.parseDouble(wDraw); //nextDouble -> parseDouble
		account1.withdraw(w); //a->a1, parameter w
		account1.deposit(3000);//a->a1

        System.out.println("------------------------------------------");
		System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
		System.out.println("Account ID: " + account1.getId()); //a->a1
		System.out.println("Date created: " + account1.getDateCreated());//a->a1, ,get->xx
		System.out.printf("Balance: MYR%.2f\n" + account1.getBalance());//a->a1 ,get->xx
		System.out.printf("Monthly interest: MYR%.2f\n" + account1.getMonthlyInterest());//a->a1 ,get->xx
        System.out.println("------------------------------------------");

        Account account2 = new Account();
		account2.setAnnualInterestRate(wDraw.charAt(0));//a->a2, fill()!!!!1
		account2.withdraw(w);//a->a2, w
		account2.deposit(300); //a->a2

        System.out.println("------------------------------------------");
		System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
		System.out.println("Account ID: " + account2.getId());
		System.out.println("Date created: " + account2.getDateCreated());
		System.out.printf("Balance: MYR%.2f\n" + account2.getBalance());
		System.out.printf("Monthly interest: MYR%.2f\n" + account2.getMonthlyInterest());
        System.out.println("------------------------------------------");
    }
}
