import java.util.*;
class ControlStatements
{
public static void main(String args[])
{
	int a=3,b=9;
	if(a < b){
		System.out.println("Hello Arun");
		if(b < a)
		{
			System.out.println("Hello Fdu");
		}
		else
			System.out.println("Hello Krishna");
	}
	else{
	System.out.println("Hello Sunil");
	System.out.println("Hello Varun");
}
	while(a < b)
	{
		System.out.println("The ten Numbers are as follows:"+(a+b));
		a++;continue;
	}
	for(a=0; a<10; a++) {
		for(b=a; b<10; b++)
		System.out.print(".");
		System.out.println();
	}
	do
	{
		System.out.println("Hello RedBull");
		a++;
	}while(a<4);
	switch(3)
	{
	case 1: System.out.println("Bob");
			break;
	case 2: System.out.println("Honey");
			break;
	case 3: System.out.println("App");
	default:System.out.println("MRF");
	}
	System.out.println("Enter your username: ");
	Scanner sc = new Scanner(System.in);
	String username = sc.nextLine();
	System.out.println("Your username is " + username);
	}
}