
public class Consturctor1 {
int a;
	public void Consturctor1(){
		
		System.out.println("Hello"+a);
		this.a=10;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Consturctor1 cs = new Consturctor1();
		cs.Consturctor1();
		//a=20;
		Consturctor1 cs2 = new Consturctor1();
		System.out.println(cs.a);
		System.out.println(cs2.a);
		
	}

}
