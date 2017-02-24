
public class Constructor {
	int x;
	int y;
	float z;
	String name;
public Constructor(int a, int b, float c, String fn){
	System.out.println("constructor");
	x = a;
	y=b;
	z=c;
	name= fn;
}

public Constructor(){
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor cs = new Constructor(10,20,30.2f,"hI");
Constructor cs1 = new Constructor(10,20,30.2f,"hIoo");
Constructor c = new Constructor();
//Constructor cs1 = new Constructor();
		System.out.println(cs1.x);
		System.out.println(cs.y);
		System.out.println(cs1.name);
		System.out.println(cs.z);
	}

}
