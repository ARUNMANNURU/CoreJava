import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount a[] = new BankAccount[10];			
		System.out.println("Enter the name ");
		Scanner sc = new Scanner(System.in);
		for(int j=0; j<a.length; j++){
			a[j] = new BankAccount();
			a[j].uInfo.Name=sc.nextLine();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].uInfo.Age);
		}
		

	}

}
