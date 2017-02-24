import java.util.Scanner;

public class Test
{
public static void main(String args[]){

// construct UserInfo, BalanceInfo, AccountInfo objects
	UserInfo uInfo = new UserInfo();
	BalanceInfo bInfo = new BalanceInfo();
	AccountInfo accInfo = new AccountInfo();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Age of Account Holder:");
	uInfo.Age=sc.nextInt();
	System.out.println("Enter Balance Account:");
	bInfo.AccountBalance=sc.nextInt();
	System.out.println("Enter Account Number:");
	accInfo.AccountNumber=sc.nextInt();
BankAccount obj = createBankAccount(uInfo, bInfo, accInfo);

displayAccountDetails(obj);



}


public static BankAccount createBankAccount(UserInfo obj1, BalanceInfo obj2, AccountInfo obj3){

// construnt BankAccount object having the above details
BankAccount obj = new BankAccount();
obj.uInfo = obj1;
obj.accInfo = obj3;
obj.bInfo = obj2;


return obj;
}

public static void displayAccountDetails(BankAccount obj){

//display the all the individual properties of the Account
System.out.println(obj.uInfo.Age);
System.out.println(obj.bInfo.AccountBalance);
System.out.println(obj.accInfo.AccountNumber);
}


}
