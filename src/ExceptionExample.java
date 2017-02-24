/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class ExceptionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arun");
		ExceptionExample ee = new ExceptionExample();
		ee.add();
	}
	public void add() throws ArithmeticException
	{
		try {
			int a=9,b=0;
			int c = a/b;
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			throw new ArithmeticException();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			//e.getMessage();
		}
		finally {
			System.out.println("Hello Arun Mannuru");
		}
			
	}
	static{
		System.out.println("HEllo bro");
	}
}
