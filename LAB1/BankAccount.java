import java.util.Scanner;
public class BankAccount {
	String id;
	float balance;
	int transactionCount;
	String name;
	public void readAccountDetails(){
		Scanner b= new Scanner(System.in);
		System.out.println("Enter Name:");
		name=b.nextLine();
		System.out.println("Enter id:");
		id=b.nextLine();
		System.out.println("Enter Balance:");
		balance=b.nextFloat();
	}

	String getAccountDetails(){
		return("ID: " + id + " Balance: " + balance + " Name:" +name);
	}
	void deposit(float amount){
		balance=balance + amount;
		transactionCount++;
	}
	void withdraw(float amount){
		balance=balance-amount;
		transactionCount++;
	}
	public static void main(String [] args){
		BankAccount acc1 = new BankAccount();
		acc1.readAccountDetails();
		System.out.println("Details \n "+ acc1.getAccountDetails());
		acc1.deposit(5000);
		acc1.getAccountDetails();
		acc1.withdraw(2500);
		acc1.getAccountDetails();
	}
}
