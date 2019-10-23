import java.util.*;
class Account
{
	String depositor_name;
	int account_number;
	String type;
	int balance;
	void getdata(String n,int ac,String typ,int bal)
	{
	depositor_name=n;
	account_number=ac;
	type=typ;
	balance=bal;
	}
	int withdraw()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the withdrawal amount");
		int withdraw = s.nextInt();
		int balance1=(balance)-(withdraw);
		System.out.println("Balance :" +balance1);
		return 0;
	}
	int assign()
	{
		depositor_name = "Pallavi Lodhi";
		account_number = 1323422;
		type = "Savings";
		balance = 5000;
		return 0;
	}
}
class BankDetails{
	public static void main(String args[])
	{
		Account b1 = new Account();
		b1.assign();
		System.out.println("Name of depositor:" +b1.depositor_name);
		System.out.println("Account Number:" +b1.account_number);
		System.out.println("Account Type:" +b1.type);
		System.out.println("Balance amount:" +b1.balance);
		
		b1.withdraw();
	}
	

}
