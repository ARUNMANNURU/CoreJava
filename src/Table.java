import java.lang.Object;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter the table number you want:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		for(int b=1;b<=10;b++)
		{
			System.out.println(a+"*"+b+"="+(a*b));
		}
		
	}

}
